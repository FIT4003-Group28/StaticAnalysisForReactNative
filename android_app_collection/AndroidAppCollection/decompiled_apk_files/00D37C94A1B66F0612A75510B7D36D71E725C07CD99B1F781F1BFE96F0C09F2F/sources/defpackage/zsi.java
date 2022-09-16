package defpackage;
/* compiled from: PG */
/* renamed from: zsi  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class zsi implements zdt {
    public final /* synthetic */ zsj a;
    public final /* synthetic */ String b;
    public final /* synthetic */ zsp c;

    public /* synthetic */ zsi(zsj zsjVar, String str, zsp zspVar) {
        this.a = zsjVar;
        this.b = str;
        this.c = zspVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        zsj zsjVar = this.a;
        String str = this.b;
        zsp zspVar = this.c;
        String str2 = (String) obj;
        synchronized (zsjVar.d) {
            zsjVar.e.put(str, zspVar);
            zsjVar.d.remove(str);
        }
    }
}
