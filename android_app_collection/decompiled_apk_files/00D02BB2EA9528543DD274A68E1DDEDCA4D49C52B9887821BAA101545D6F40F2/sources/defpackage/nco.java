package defpackage;
/* compiled from: PG */
/* renamed from: nco  reason: default package */
/* loaded from: classes7.dex */
enum nco {
    SUCCESS_WITH_RESULTS(0),
    SUCCESS_WITHOUT_RESULTS(1),
    FAILURE_WITH_RESULTS(2),
    FAILURE_REQUEST_TIMEOUT(3),
    FAILURE_NO_CONNECTIVITY(4),
    FAILURE_IO_ERROR(5),
    FAILURE_OTHER(6);
    
    public final int h;

    nco(int i2) {
        this.h = i2;
    }
}
