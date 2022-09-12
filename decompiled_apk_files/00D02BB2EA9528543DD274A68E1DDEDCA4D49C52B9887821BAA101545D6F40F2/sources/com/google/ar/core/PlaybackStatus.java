package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);
    
    final int nativeCode;

    PlaybackStatus(int i) {
        this.nativeCode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PlaybackStatus forNumber(int i) {
        PlaybackStatus[] values;
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i) {
                return playbackStatus;
            }
        }
        StringBuilder sb = new StringBuilder(61);
        sb.append("Unexpected value for native PlaybackStatus, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }
}
