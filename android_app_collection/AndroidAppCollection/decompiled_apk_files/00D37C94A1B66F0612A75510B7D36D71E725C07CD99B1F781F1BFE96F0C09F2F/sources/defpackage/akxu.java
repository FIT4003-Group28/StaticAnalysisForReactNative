package defpackage;

import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: akxu  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class akxu implements ylv {
    public final /* synthetic */ akxz a;
    public final /* synthetic */ String b;
    private final /* synthetic */ int c;

    public /* synthetic */ akxu(akxz akxzVar, String str) {
        this.a = akxzVar;
        this.b = str;
    }

    public /* synthetic */ akxu(akxz akxzVar, String str, int i) {
        this.c = i;
        this.a = akxzVar;
        this.b = str;
    }

    @Override // defpackage.zdt
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        int i = this.c;
        if (i == 0) {
            b((Throwable) obj);
        } else if (i == 1) {
            b((Throwable) obj);
        } else {
            b((Throwable) obj);
        }
    }

    @Override // defpackage.ylv
    public final void b(Throwable th) {
        int i = this.c;
        if (i == 0) {
            akxz akxzVar = this.a;
            String str = this.b;
            avug avugVar = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED;
            akxzVar.n.c(str);
            if (th instanceof TimeoutException) {
                avugVar = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_TIMED_OUT;
            }
            akxzVar.D(str, avugVar, "Failed to create upload job.", th);
        } else if (i == 1) {
            akxz akxzVar2 = this.a;
            String str2 = this.b;
            avug avugVar2 = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_FAILED;
            if (th instanceof TimeoutException) {
                avugVar2 = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CANCELLATION_TIMED_OUT;
            }
            akxzVar2.D(str2, avugVar2, "Failed to cancel the upload.", th);
            akxzVar2.x(str2, false);
        } else {
            akxz akxzVar3 = this.a;
            String str3 = this.b;
            avug avugVar3 = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_FAILED;
            akxzVar3.n.c(str3);
            if (th instanceof TimeoutException) {
                avugVar3 = avug.UPLOAD_CREATION_FAILURE_REASON_JOB_CREATION_TIMED_OUT;
            }
            akxzVar3.D(str3, avugVar3, "Failed to create upload jobs.", th);
        }
    }
}
