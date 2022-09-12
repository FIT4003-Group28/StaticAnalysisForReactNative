package defpackage;
/* compiled from: PG */
/* renamed from: bbuw  reason: default package */
/* loaded from: classes3.dex */
public final class bbuw implements bbvl {
    private bbvk a = bbvk.UNMUTED;

    @Override // defpackage.bbvl
    public final void a(String str, bbvk bbvkVar) {
        this.a = bbvkVar;
    }

    @Override // defpackage.bbvl
    public final boolean b(String str) {
        return this.a == bbvk.MUTED;
    }
}
