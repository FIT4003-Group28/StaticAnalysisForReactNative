package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: ahqf  reason: default package */
/* loaded from: classes2.dex */
public final class ahqf extends ahqe {
    private final float b;

    public ahqf(long j, float f) {
        super(j);
        this.b = f;
    }

    @Override // defpackage.ahqe
    public final void c(ahqb ahqbVar) {
        ahqbVar.m(this.a, this.b);
    }

    @Override // defpackage.ahqe
    public final void d(ddrh ddrhVar) {
        int i = (int) this.b;
        if (ddrhVar.c) {
            ddrhVar.bF();
            ddrhVar.c = false;
        }
        ddri ddriVar = (ddri) ddrhVar.b;
        ddri ddriVar2 = ddri.r;
        ddriVar.a |= ImageMetadata.SHADING_MODE;
        ddriVar.q = i;
    }
}
