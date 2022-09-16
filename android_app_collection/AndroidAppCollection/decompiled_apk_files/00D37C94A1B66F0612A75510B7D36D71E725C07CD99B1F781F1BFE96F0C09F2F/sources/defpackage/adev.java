package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adev  reason: default package */
/* loaded from: classes.dex */
public final class adev implements ynl {
    final /* synthetic */ adew a;

    public adev(adew adewVar) {
        this.a = adewVar;
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = false;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    this.a.d = ((adoo) obj).a();
                    adew adewVar = this.a;
                    adewVar.jL(adewVar.e());
                    return null;
                }
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
            adnt a = ((adob) obj).a();
            adew adewVar2 = this.a;
            if (a != null && a.a() == 0) {
                z = true;
            }
            adewVar2.c = z;
            this.a.l();
            adew adewVar3 = this.a;
            adewVar3.jL(adewVar3.e());
            return null;
        }
        return new Class[]{adob.class, adoo.class};
    }
}
