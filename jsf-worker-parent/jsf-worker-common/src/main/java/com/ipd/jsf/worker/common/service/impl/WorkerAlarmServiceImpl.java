/**
 * Copyright 2004-2048 .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ipd.jsf.worker.common.service.impl;

import com.ipd.jsf.worker.common.domain.WorkerAlarm;
import com.ipd.jsf.worker.common.log.dao.WorkerAlarmDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipd.jsf.worker.common.service.WorkerAlarmService;

@Service
public class WorkerAlarmServiceImpl implements WorkerAlarmService {

    @Autowired
    private WorkerAlarmDAO workerAlarmDAO;

    @Override
    public void addWorkerAlarm(WorkerAlarm workerAlarm) {
        workerAlarmDAO.insertWorkerAlarm(workerAlarm);
    }

    public WorkerAlarmDAO getWorkerAlarmDAO() {
        return workerAlarmDAO;
    }

    public void setWorkerAlarmDAO(WorkerAlarmDAO workerAlarmDAO) {
        this.workerAlarmDAO = workerAlarmDAO;
    }
}
