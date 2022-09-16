package defpackage;

import com.google.android.libraries.youtube.mdx.FeatureFlagsImpl;
/* compiled from: PG */
/* renamed from: acwr  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acwr implements ayqb {
    public final /* synthetic */ FeatureFlagsImpl a;
    private final /* synthetic */ int b;

    public /* synthetic */ acwr(FeatureFlagsImpl featureFlagsImpl, int i) {
        this.b = i;
        this.a = featureFlagsImpl;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        adct adctVar;
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            FeatureFlagsImpl featureFlagsImpl = this.a;
            Boolean bool = (Boolean) obj;
            String.format("[mdxEnableEduChildGating=%b]", bool);
            featureFlagsImpl.k.c(bool);
        } else if (i != 1) {
            FeatureFlagsImpl featureFlagsImpl2 = this.a;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Boolean valueOf = Boolean.valueOf(booleanValue);
            String.format("isCastingFeaturesEnabled=%s", valueOf);
            featureFlagsImpl2.d.c(valueOf);
            featureFlagsImpl2.e.c(valueOf);
            featureFlagsImpl2.g.c(valueOf);
            featureFlagsImpl2.f.c(valueOf);
            featureFlagsImpl2.h.c(valueOf);
            azpm azpmVar = featureFlagsImpl2.i;
            acwu acwuVar = featureFlagsImpl2.b;
            boolean z2 = acwuVar.ad;
            boolean z3 = acwuVar.ae;
            if (!booleanValue) {
                adctVar = adct.DISABLED;
            } else if (z3) {
                adctVar = adct.COUNTERFACTUAL;
            } else if (z2) {
                adctVar = adct.FULLY_ENABLED;
            } else {
                adctVar = adct.DISABLED;
            }
            azpmVar.c(adctVar);
        } else {
            FeatureFlagsImpl featureFlagsImpl3 = this.a;
            arhd arhdVar = (arhd) obj;
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf((arhdVar.b & 131072) != 0);
            atdn atdnVar = arhdVar.l;
            if (atdnVar == null) {
                atdnVar = atdn.a;
            }
            if ((atdnVar.b & 2048) != 0) {
                z = true;
            }
            objArr[1] = Boolean.valueOf(z);
            String.format("[hasHotConfig=%b] [hasEnableSupexGuard=%b]", objArr);
            azpm azpmVar2 = featureFlagsImpl3.j;
            atdn atdnVar2 = arhdVar.l;
            if (atdnVar2 == null) {
                atdnVar2 = atdn.a;
            }
            azpmVar2.c(Boolean.valueOf(atdnVar2.f));
            azpm azpmVar3 = featureFlagsImpl3.l;
            atdn atdnVar3 = arhdVar.l;
            if (atdnVar3 == null) {
                atdnVar3 = atdn.a;
            }
            azpmVar3.c(Boolean.valueOf(atdnVar3.d));
            azpm azpmVar4 = featureFlagsImpl3.m;
            atdn atdnVar4 = arhdVar.l;
            if (atdnVar4 == null) {
                atdnVar4 = atdn.a;
            }
            azpmVar4.c(Boolean.valueOf(atdnVar4.e));
        }
    }
}
