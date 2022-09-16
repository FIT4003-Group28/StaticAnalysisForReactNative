package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);
    
    final int nativeCode;

    RecordingStatus(int i) {
        this.nativeCode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RecordingStatus forNumber(int i) {
        RecordingStatus[] values;
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i) {
                return recordingStatus;
            }
        }
        StringBuilder sb = new StringBuilder(62);
        sb.append("Unexpected value for native RecordingStatus, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }
}
