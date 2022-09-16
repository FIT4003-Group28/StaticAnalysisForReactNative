package defpackage;
/* compiled from: PG */
/* renamed from: alhk  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class alhk implements ayqb {
    public final /* synthetic */ alhl a;
    private final /* synthetic */ int b;

    public /* synthetic */ alhk(alhl alhlVar, int i) {
        this.b = i;
        this.a = alhlVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            alhl alhlVar = this.a;
            if (!alhlVar.d.a((alcw) obj)) {
                return;
            }
            alhlVar.c.set(true);
            alhlVar.c();
        } else if (i == 1) {
            alhl alhlVar2 = this.a;
            if (!alhlVar2.d.a((alcw) obj)) {
                return;
            }
            alhlVar2.c.set(true);
        } else if (i == 2) {
            alhl alhlVar3 = this.a;
            Throwable th = (Throwable) obj;
            int i2 = alhlVar3.a;
            StringBuilder sb = new StringBuilder(80);
            sb.append("AbstractUploadEntityRequirement Error while checking the requirement ");
            sb.append(i2);
            String sb2 = sb.toString();
            zep.f("AbstractUploadEntityRequirement", sb2, th);
            alhlVar3.b.b(sb2, th);
        } else {
            alhl alhlVar4 = this.a;
            Throwable th2 = (Throwable) obj;
            int i3 = alhlVar4.a;
            StringBuilder sb3 = new StringBuilder(81);
            sb3.append("AbstractUploadEntityRequirement Error while observing the requirement ");
            sb3.append(i3);
            String sb4 = sb3.toString();
            zep.f("AbstractUploadEntityRequirement", sb4, th2);
            alhlVar4.b.b(sb4, th2);
        }
    }
}
