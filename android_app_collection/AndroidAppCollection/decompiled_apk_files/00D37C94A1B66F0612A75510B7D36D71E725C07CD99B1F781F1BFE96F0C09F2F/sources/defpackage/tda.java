package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: tda  reason: default package */
/* loaded from: classes4.dex */
public final class tda {
    public static final tda a = a().a();
    public final View b;
    public final Integer c;
    public final Integer d;
    public final tfd e;
    public final ayqh f;
    public final float g;
    public final boolean h;
    public final Map i;
    public final ya j;
    public final boolean k;
    public final boolean l;
    public final StringBuilder m;
    public final WeakReference n;
    public final WeakReference o;
    public final tee p;
    public final amuk q;
    public final tdh r;
    public final String s;
    public final String t;
    public final tdz u;
    public final boolean v;
    public final AtomicReference w;
    public final akcr x;

    public tda() {
    }

    public tda(View view, Integer num, Integer num2, tfd tfdVar, ayqh ayqhVar, float f, boolean z, Map map, akcr akcrVar, ya yaVar, boolean z2, boolean z3, StringBuilder sb, WeakReference weakReference, WeakReference weakReference2, tee teeVar, amuk amukVar, tdh tdhVar, String str, String str2, tdz tdzVar, boolean z4, AtomicReference atomicReference) {
        this.b = view;
        this.c = num;
        this.d = num2;
        this.e = tfdVar;
        this.f = ayqhVar;
        this.g = f;
        this.h = z;
        this.i = map;
        this.x = akcrVar;
        this.j = yaVar;
        this.k = z2;
        this.l = z3;
        this.m = sb;
        this.n = weakReference;
        this.o = weakReference2;
        this.p = teeVar;
        this.q = amukVar;
        this.r = tdhVar;
        this.s = str;
        this.t = str2;
        this.u = tdzVar;
        this.v = z4;
        this.w = atomicReference;
    }

    public static tcz a() {
        tcz tczVar = new tcz();
        tczVar.b(true);
        tczVar.h = false;
        tczVar.e(false);
        tczVar.f(true);
        tczVar.d = tfd.b;
        tczVar.i = new StringBuilder();
        tczVar.c(0.0f);
        tczVar.b(false);
        return tczVar;
    }

    public final tee b() {
        tdz tdzVar = this.u;
        return tdzVar != null ? tdzVar.d : this.p;
    }

    public final awoc c() {
        WeakReference weakReference = this.n;
        if (weakReference == null) {
            return null;
        }
        return (awoc) weakReference.get();
    }

    public final boolean d() {
        tdz tdzVar = this.u;
        return tdzVar != null ? tdzVar.e : this.k;
    }

    public final tcz e() {
        return new tcz(this);
    }

    public final boolean equals(Object obj) {
        Map map;
        akcr akcrVar;
        ya yaVar;
        StringBuilder sb;
        WeakReference weakReference;
        WeakReference weakReference2;
        tee teeVar;
        amuk amukVar;
        tdh tdhVar;
        String str;
        String str2;
        tdz tdzVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof tda) {
            tda tdaVar = (tda) obj;
            View view = this.b;
            if (view != null ? view.equals(tdaVar.b) : tdaVar.b == null) {
                Integer num = this.c;
                if (num != null ? num.equals(tdaVar.c) : tdaVar.c == null) {
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(tdaVar.d) : tdaVar.d == null) {
                        tfd tfdVar = this.e;
                        if (tfdVar != null ? tfdVar.equals(tdaVar.e) : tdaVar.e == null) {
                            ayqh ayqhVar = this.f;
                            if (ayqhVar != null ? ayqhVar.equals(tdaVar.f) : tdaVar.f == null) {
                                if (Float.floatToIntBits(this.g) == Float.floatToIntBits(tdaVar.g) && this.h == tdaVar.h && ((map = this.i) != null ? map.equals(tdaVar.i) : tdaVar.i == null) && ((akcrVar = this.x) != null ? akcrVar.equals(tdaVar.x) : tdaVar.x == null) && ((yaVar = this.j) != null ? yaVar.equals(tdaVar.j) : tdaVar.j == null) && this.k == tdaVar.k && this.l == tdaVar.l && ((sb = this.m) != null ? sb.equals(tdaVar.m) : tdaVar.m == null) && ((weakReference = this.n) != null ? weakReference.equals(tdaVar.n) : tdaVar.n == null) && ((weakReference2 = this.o) != null ? weakReference2.equals(tdaVar.o) : tdaVar.o == null) && ((teeVar = this.p) != null ? teeVar.equals(tdaVar.p) : tdaVar.p == null) && ((amukVar = this.q) != null ? amxp.v(amukVar, tdaVar.q) : tdaVar.q == null) && ((tdhVar = this.r) != null ? tdhVar.equals(tdaVar.r) : tdaVar.r == null) && ((str = this.s) != null ? str.equals(tdaVar.s) : tdaVar.s == null) && ((str2 = this.t) != null ? str2.equals(tdaVar.t) : tdaVar.t == null) && ((tdzVar = this.u) != null ? tdzVar.equals(tdaVar.u) : tdaVar.u == null) && this.v == tdaVar.v) {
                                    AtomicReference atomicReference = this.w;
                                    AtomicReference atomicReference2 = tdaVar.w;
                                    if (atomicReference != null ? atomicReference.equals(atomicReference2) : atomicReference2 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        View view = this.b;
        int i = 0;
        int hashCode = ((view == null ? 0 : view.hashCode()) ^ 1000003) * 1000003;
        Integer num = this.c;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.d;
        int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        tfd tfdVar = this.e;
        int hashCode4 = (hashCode3 ^ (tfdVar == null ? 0 : tfdVar.hashCode())) * 1000003;
        ayqh ayqhVar = this.f;
        int i2 = 1237;
        int hashCode5 = (((((hashCode4 ^ (ayqhVar == null ? 0 : ayqhVar.hashCode())) * 1000003) ^ Float.floatToIntBits(this.g)) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        Map map = this.i;
        int hashCode6 = (hashCode5 ^ (map == null ? 0 : map.hashCode())) * 1000003;
        akcr akcrVar = this.x;
        int hashCode7 = (hashCode6 ^ (akcrVar == null ? 0 : akcrVar.hashCode())) * 1000003;
        ya yaVar = this.j;
        int hashCode8 = (((((hashCode7 ^ (yaVar == null ? 0 : yaVar.hashCode())) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * (-721379959);
        StringBuilder sb = this.m;
        int hashCode9 = (hashCode8 ^ (sb == null ? 0 : sb.hashCode())) * 1000003;
        WeakReference weakReference = this.n;
        int hashCode10 = (hashCode9 ^ (weakReference == null ? 0 : weakReference.hashCode())) * 1000003;
        WeakReference weakReference2 = this.o;
        int hashCode11 = (hashCode10 ^ (weakReference2 == null ? 0 : weakReference2.hashCode())) * 1000003;
        tee teeVar = this.p;
        int hashCode12 = (hashCode11 ^ (teeVar == null ? 0 : teeVar.hashCode())) * 1000003;
        amuk amukVar = this.q;
        int hashCode13 = (hashCode12 ^ (amukVar == null ? 0 : amukVar.hashCode())) * 1000003;
        tdh tdhVar = this.r;
        int hashCode14 = (hashCode13 ^ (tdhVar == null ? 0 : tdhVar.hashCode())) * 1000003;
        String str = this.s;
        int hashCode15 = (hashCode14 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.t;
        int hashCode16 = (hashCode15 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        tdz tdzVar = this.u;
        int hashCode17 = (hashCode16 ^ (tdzVar == null ? 0 : tdzVar.hashCode())) * 1000003;
        if (true == this.v) {
            i2 = 1231;
        }
        int i3 = (hashCode17 ^ i2) * 1000003;
        AtomicReference atomicReference = this.w;
        if (atomicReference != null) {
            i = atomicReference.hashCode();
        }
        return i3 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        float f = this.g;
        boolean z = this.h;
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.x);
        String valueOf8 = String.valueOf(this.j);
        boolean z2 = this.k;
        boolean z3 = this.l;
        String valueOf9 = String.valueOf(this.m);
        String valueOf10 = String.valueOf(this.n);
        String valueOf11 = String.valueOf(this.o);
        String valueOf12 = String.valueOf(this.p);
        String valueOf13 = String.valueOf(this.q);
        String valueOf14 = String.valueOf(this.r);
        String str = this.s;
        String str2 = this.t;
        String valueOf15 = String.valueOf(this.u);
        boolean z4 = this.v;
        String valueOf16 = String.valueOf(this.w);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        int length5 = String.valueOf(valueOf5).length();
        int length6 = String.valueOf(valueOf6).length();
        int length7 = String.valueOf(valueOf7).length();
        int length8 = String.valueOf(valueOf8).length();
        int length9 = "null".length();
        int length10 = String.valueOf(valueOf9).length();
        int length11 = String.valueOf(valueOf10).length();
        int length12 = String.valueOf(valueOf11).length();
        int length13 = String.valueOf(valueOf12).length();
        int length14 = String.valueOf(valueOf13).length();
        int length15 = String.valueOf(valueOf14).length();
        int length16 = String.valueOf(str).length();
        int length17 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 674 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + length16 + length17 + String.valueOf(valueOf15).length() + String.valueOf(valueOf16).length());
        sb.append("ConversionContext{container=");
        sb.append(valueOf);
        sb.append(", widthConstraint=");
        sb.append(valueOf2);
        sb.append(", heightConstraint=");
        sb.append(valueOf3);
        sb.append(", templateLoggerFactory=");
        sb.append(valueOf4);
        sb.append(", rootDisposableContainer=");
        sb.append(valueOf5);
        sb.append(", imagePrefetchRangeRatio=");
        sb.append(f);
        sb.append(", useDynamicPropsForStylePropertiesInternal=");
        sb.append(z);
        sb.append(", dynamicPropsMap=");
        sb.append(valueOf6);
        sb.append(", horizontalCollectionTouchInterceptor=");
        sb.append(valueOf7);
        sb.append(", horizontalCollectionSwipeProtector=");
        sb.append(valueOf8);
        sb.append(", useIncrementalMountOnChildrenInternal=");
        sb.append(z2);
        sb.append(", useLegacyVisibleInternal=");
        sb.append(z3);
        sb.append(", recyclerBinderConfiguration=");
        sb.append("null");
        sb.append(", pathBuilder=");
        sb.append(valueOf9);
        sb.append(", loggingNodeInternal=");
        sb.append(valueOf10);
        sb.append(", parentLoggingNodeInternal=");
        sb.append(valueOf11);
        sb.append(", elementsInteractionLoggerInternal=");
        sb.append(valueOf12);
        sb.append(", globalCommandDataDecorators=");
        sb.append(valueOf13);
        sb.append(", decoratingElementBuilder=");
        sb.append(valueOf14);
        sb.append(", debugId=");
        sb.append(str);
        sb.append(", treeDebugId=");
        sb.append(str2);
        sb.append(", elementsConfig=");
        sb.append(valueOf15);
        sb.append(", couldOverlapWithElementsConfig=");
        sb.append(z4);
        sb.append(", scrollStrategyListenerHolder=");
        sb.append(valueOf16);
        sb.append("}");
        return sb.toString();
    }
}
