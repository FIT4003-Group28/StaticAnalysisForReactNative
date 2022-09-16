package defpackage;
/* compiled from: PG */
/* renamed from: ajkd  reason: default package */
/* loaded from: classes.dex */
public final class ajkd {
    public final int a;
    public final float b;
    public final ajkb c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final float o;
    public final boolean p;
    private final boolean q;

    public ajkd() {
    }

    public ajkd(int i, float f, ajkb ajkbVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i2, float f2, boolean z11, boolean z12) {
        this.a = i;
        this.b = f;
        this.c = ajkbVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = z9;
        this.m = z10;
        this.n = i2;
        this.o = f2;
        this.p = z11;
        this.q = z12;
    }

    public static ajkc a(ajkb ajkbVar) {
        amuk amukVar;
        ajkc ajkcVar = new ajkc();
        amuk amukVar2 = ajke.a;
        int i = ((amxx) amukVar2).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((ajkh) amukVar2.get(i2)).a(ajkcVar);
        }
        if (ajkbVar != null && (amukVar = (amuk) ajke.b.get(ajkbVar)) != null) {
            int size = amukVar.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ajkh) amukVar.get(i3)).a(ajkcVar);
            }
        }
        return ajkcVar;
    }

    public final boolean equals(Object obj) {
        ajkb ajkbVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajkd) {
            ajkd ajkdVar = (ajkd) obj;
            if (this.a == ajkdVar.a && Float.floatToIntBits(this.b) == Float.floatToIntBits(ajkdVar.b) && ((ajkbVar = this.c) != null ? ajkbVar.equals(ajkdVar.c) : ajkdVar.c == null) && this.d == ajkdVar.d && this.e == ajkdVar.e && this.f == ajkdVar.f && this.g == ajkdVar.g && this.h == ajkdVar.h && this.i == ajkdVar.i && this.j == ajkdVar.j && this.k == ajkdVar.k && this.l == ajkdVar.l && this.m == ajkdVar.m && this.n == ajkdVar.n && Float.floatToIntBits(this.o) == Float.floatToIntBits(ajkdVar.o) && this.p == ajkdVar.p && this.q == ajkdVar.q) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int floatToIntBits = (((this.a ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003;
        ajkb ajkbVar = this.c;
        int i = 1237;
        int hashCode = (((((((((((((((((((((((((((floatToIntBits ^ (ajkbVar == null ? 0 : ajkbVar.hashCode())) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ this.n) * 1000003) ^ Float.floatToIntBits(this.o)) * 1000003) ^ (true != this.p ? 1237 : 1231)) * 1000003;
        if (true == this.q) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        int i = this.a;
        float f = this.b;
        String valueOf = String.valueOf(this.c);
        boolean z = this.d;
        boolean z2 = this.e;
        boolean z3 = this.f;
        boolean z4 = this.g;
        boolean z5 = this.h;
        boolean z6 = this.i;
        boolean z7 = this.j;
        boolean z8 = this.k;
        boolean z9 = this.l;
        boolean z10 = this.m;
        int i2 = this.n;
        float f2 = this.o;
        boolean z11 = this.p;
        boolean z12 = this.q;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 567);
        sb.append("SurfaceConfig{lithoInitRange=");
        sb.append(i);
        sb.append(", lithoRangeRatio=");
        sb.append(f);
        sb.append(", surfaceName=");
        sb.append(valueOf);
        sb.append(", recyclerViewItemPrefetch=");
        sb.append(z);
        sb.append(", recyclerViewFixedSize=");
        sb.append(z2);
        sb.append(", recyclerViewDisableViewCache=");
        sb.append(z3);
        sb.append(", useIncrementalMountForRb=");
        sb.append(z4);
        sb.append(", useLegacyVisible=");
        sb.append(z5);
        sb.append(", horizontalCollectionTouchInterceptor=");
        sb.append(z6);
        sb.append(", useSwipeToCameraLocalElementsConfig=");
        sb.append(z7);
        sb.append(", useSizeSpecYouTubeElement=");
        sb.append(z8);
        sb.append(", useAsyncPresenterPreparation=");
        sb.append(z9);
        sb.append(", rebindAfterDetach=");
        sb.append(z10);
        sb.append(", asyncPrepareInitRange=");
        sb.append(i2);
        sb.append(", asyncPrepareRangeRatio=");
        sb.append(f2);
        sb.append(", useIncrementalMountForAsyncPrepare=");
        sb.append(z11);
        sb.append(", useFlatbufferRuntime=");
        sb.append(z12);
        sb.append("}");
        return sb.toString();
    }
}
