package defpackage;
/* compiled from: PG */
/* renamed from: zwm  reason: default package */
/* loaded from: classes4.dex */
public final class zwm {
    public asjj a;
    private final acti b;

    public zwm(acti actiVar) {
        this.b = actiVar;
    }

    public final void a(String str) {
        if ("trim_handle_interaction".equals(str)) {
            this.b.H(3, new acte(actj.UPLOAD_VIDEO_EDITING_TRIM_VIEW), this.a);
            return;
        }
        znm a = znm.a(this.b, str);
        aopa mo52toBuilder = a.b.mo52toBuilder();
        asjj asjjVar = this.a;
        if (asjjVar != null) {
            mo52toBuilder.mergeFrom((aopi) asjjVar);
        }
        awbs awbsVar = a.a;
        if (awbsVar == null) {
            return;
        }
        this.b.H(3, acun.a(awbsVar), (asjj) mo52toBuilder.mo39build());
    }
}
