package defpackage;
/* compiled from: PG */
/* renamed from: vgm  reason: default package */
/* loaded from: classes4.dex */
public enum vgm {
    HIDDEN(0.0f),
    COLLAPSED(25.0f),
    EXPANDED(75.0f),
    FULLY_EXPANDED(100.0f);
    
    vgm e;
    public vgm f;
    public final float g;

    static {
        vgm vgmVar = HIDDEN;
        vgm vgmVar2 = COLLAPSED;
        vgm vgmVar3 = EXPANDED;
        vgm vgmVar4 = FULLY_EXPANDED;
        vgmVar.e = vgmVar;
        vgmVar.f = vgmVar;
        vgmVar2.e = vgmVar2;
        vgmVar2.f = vgmVar3;
        vgmVar3.e = vgmVar2;
        vgmVar3.f = vgmVar4;
        vgmVar4.e = vgmVar3;
        vgmVar4.f = vgmVar4;
    }

    vgm(float f) {
        this.g = f;
    }
}
