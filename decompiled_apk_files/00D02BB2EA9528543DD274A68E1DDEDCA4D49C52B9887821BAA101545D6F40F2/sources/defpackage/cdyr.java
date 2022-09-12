package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cdyr  reason: default package */
/* loaded from: classes4.dex */
enum cdyr {
    READ_EXTERNAL_STORAGE("android.permission.READ_EXTERNAL_STORAGE"),
    CAMERA("android.permission.CAMERA");
    
    private final String c;

    cdyr(String str) {
        this.c = str;
    }

    public final bdmb a(bdmc bdmcVar, Bundle bundle) {
        bdma bdmaVar = (bdma) bundle.getSerializable(String.valueOf(this.c).concat("_permission_request_state"));
        bdlz bdlzVar = (bdlz) bundle.getSerializable(String.valueOf(this.c).concat("_permission_detailed_state"));
        String str = this.c;
        if (bdmaVar == null) {
            bdmaVar = bdma.NOT_STARTED;
        }
        if (bdlzVar == null) {
            bdlzVar = bdlz.UNKNOWN;
        }
        return bdmcVar.a(str, bdmaVar, bdlzVar);
    }
}
