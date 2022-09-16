package defpackage;

import com.google.android.apps.youtube.app.common.ui.actionbar.ActionBarColor;
import com.google.android.libraries.youtube.innertube.model.BrowseResponseModel;
import j$.util.Optional;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ior  reason: default package */
/* loaded from: classes3.dex */
public final class ior {
    public final amuk a;
    public final int b;
    public final byte[] c;
    public final BrowseResponseModel d;
    public final CharSequence e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final ActionBarColor i;
    public final ActionBarColor j;
    public final ActionBarColor k;
    public final ActionBarColor l;
    public final ActionBarColor m;
    public final boolean n;
    public final apzg o;
    public final Optional p;
    public final akam q;
    public final akam r;
    public final akam s;
    public final amuk t;
    public final amuk u;

    public ior(amuk amukVar, int i, byte[] bArr, BrowseResponseModel browseResponseModel, CharSequence charSequence, boolean z, boolean z2, long j, ActionBarColor actionBarColor, ActionBarColor actionBarColor2, ActionBarColor actionBarColor3, ActionBarColor actionBarColor4, ActionBarColor actionBarColor5, boolean z3, apzg apzgVar, Optional optional, akam akamVar, akam akamVar2, akam akamVar3, amuk amukVar2, amuk amukVar3) {
        if (amukVar != null) {
            this.a = amukVar;
            this.b = i;
            if (bArr != null) {
                this.c = bArr;
                this.d = browseResponseModel;
                this.e = charSequence;
                this.f = z;
                this.g = z2;
                this.h = j;
                this.i = actionBarColor;
                this.j = actionBarColor2;
                this.k = actionBarColor3;
                this.l = actionBarColor4;
                this.m = actionBarColor5;
                this.n = z3;
                if (apzgVar != null) {
                    this.o = apzgVar;
                    if (optional != null) {
                        this.p = optional;
                        this.q = akamVar;
                        this.r = akamVar2;
                        this.s = akamVar3;
                        if (amukVar2 != null) {
                            this.t = amukVar2;
                            if (amukVar3 != null) {
                                this.u = amukVar3;
                                return;
                            }
                            throw new NullPointerException("Null engagementPanelRenderers");
                        }
                        throw new NullPointerException("Null homeAdsPanelRenderers");
                    }
                    throw new NullPointerException("Null viewScrolledBeyondThresholdCommand");
                }
                throw new NullPointerException("Null backgroundResponseReceivedCommand");
            }
            throw new NullPointerException("Null responseTrackingParams");
        }
        throw new NullPointerException("Null tabsAndSectionListControllerStates");
    }

    public final boolean equals(Object obj) {
        BrowseResponseModel browseResponseModel;
        CharSequence charSequence;
        ActionBarColor actionBarColor;
        ActionBarColor actionBarColor2;
        ActionBarColor actionBarColor3;
        ActionBarColor actionBarColor4;
        ActionBarColor actionBarColor5;
        akam akamVar;
        akam akamVar2;
        akam akamVar3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ior) {
            ior iorVar = (ior) obj;
            if (amxp.v(this.a, iorVar.a) && this.b == iorVar.b) {
                if (Arrays.equals(this.c, iorVar instanceof ior ? iorVar.c : iorVar.c) && ((browseResponseModel = this.d) != null ? browseResponseModel.equals(iorVar.d) : iorVar.d == null) && ((charSequence = this.e) != null ? charSequence.equals(iorVar.e) : iorVar.e == null) && this.f == iorVar.f && this.g == iorVar.g && this.h == iorVar.h && ((actionBarColor = this.i) != null ? actionBarColor.equals(iorVar.i) : iorVar.i == null) && ((actionBarColor2 = this.j) != null ? actionBarColor2.equals(iorVar.j) : iorVar.j == null) && ((actionBarColor3 = this.k) != null ? actionBarColor3.equals(iorVar.k) : iorVar.k == null) && ((actionBarColor4 = this.l) != null ? actionBarColor4.equals(iorVar.l) : iorVar.l == null) && ((actionBarColor5 = this.m) != null ? actionBarColor5.equals(iorVar.m) : iorVar.m == null) && this.n == iorVar.n && this.o.equals(iorVar.o) && this.p.equals(iorVar.p) && ((akamVar = this.q) != null ? akamVar.equals(iorVar.q) : iorVar.q == null) && ((akamVar2 = this.r) != null ? akamVar2.equals(iorVar.r) : iorVar.r == null) && ((akamVar3 = this.s) != null ? akamVar3.equals(iorVar.s) : iorVar.s == null) && amxp.v(this.t, iorVar.t) && amxp.v(this.u, iorVar.u)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ (-721379959)) * 1000003) ^ this.b) * 1000003) ^ Arrays.hashCode(this.c)) * 1000003;
        BrowseResponseModel browseResponseModel = this.d;
        int i = 0;
        int hashCode2 = (hashCode ^ (browseResponseModel == null ? 0 : browseResponseModel.hashCode())) * 1000003;
        CharSequence charSequence = this.e;
        int i2 = 1237;
        int hashCode3 = (((hashCode2 ^ (charSequence == null ? 0 : charSequence.hashCode())) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003;
        int i3 = true != this.g ? 1237 : 1231;
        long j = this.h;
        int i4 = (((hashCode3 ^ i3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        ActionBarColor actionBarColor = this.i;
        int hashCode4 = (i4 ^ (actionBarColor == null ? 0 : actionBarColor.hashCode())) * 1000003;
        ActionBarColor actionBarColor2 = this.j;
        int hashCode5 = (hashCode4 ^ (actionBarColor2 == null ? 0 : actionBarColor2.hashCode())) * 1000003;
        ActionBarColor actionBarColor3 = this.k;
        int hashCode6 = (hashCode5 ^ (actionBarColor3 == null ? 0 : actionBarColor3.hashCode())) * 1000003;
        ActionBarColor actionBarColor4 = this.l;
        int hashCode7 = (hashCode6 ^ (actionBarColor4 == null ? 0 : actionBarColor4.hashCode())) * 1000003;
        ActionBarColor actionBarColor5 = this.m;
        int hashCode8 = (hashCode7 ^ (actionBarColor5 == null ? 0 : actionBarColor5.hashCode())) * 1000003;
        if (true == this.n) {
            i2 = 1231;
        }
        int hashCode9 = (((((hashCode8 ^ i2) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003;
        akam akamVar = this.q;
        int hashCode10 = (hashCode9 ^ (akamVar == null ? 0 : akamVar.hashCode())) * 1000003;
        akam akamVar2 = this.r;
        int hashCode11 = (hashCode10 ^ (akamVar2 == null ? 0 : akamVar2.hashCode())) * 1000003;
        akam akamVar3 = this.s;
        if (akamVar3 != null) {
            i = akamVar3.hashCode();
        }
        return ((((hashCode11 ^ i) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String arrays = Arrays.toString(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        long j = this.h;
        String valueOf4 = String.valueOf(this.i);
        String valueOf5 = String.valueOf(this.j);
        String valueOf6 = String.valueOf(this.k);
        String valueOf7 = String.valueOf(this.l);
        String valueOf8 = String.valueOf(this.m);
        boolean z3 = this.n;
        String valueOf9 = String.valueOf(this.o);
        String valueOf10 = String.valueOf(this.p);
        String valueOf11 = String.valueOf(this.q);
        String valueOf12 = String.valueOf(this.r);
        String valueOf13 = String.valueOf(this.s);
        String valueOf14 = String.valueOf(this.t);
        String valueOf15 = String.valueOf(this.u);
        int length = "null".length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(arrays).length();
        int length4 = String.valueOf(valueOf2).length();
        int length5 = String.valueOf(valueOf3).length();
        int length6 = String.valueOf(valueOf4).length();
        int length7 = String.valueOf(valueOf5).length();
        int length8 = String.valueOf(valueOf6).length();
        int length9 = String.valueOf(valueOf7).length();
        int length10 = String.valueOf(valueOf8).length();
        int length11 = String.valueOf(valueOf9).length();
        int length12 = String.valueOf(valueOf10).length();
        int length13 = String.valueOf(valueOf11).length();
        int length14 = String.valueOf(valueOf12).length();
        int length15 = String.valueOf(valueOf13).length();
        StringBuilder sb = new StringBuilder(length + 597 + length2 + length3 + length4 + length5 + length6 + length7 + length8 + length9 + length10 + length11 + length12 + length13 + length14 + length15 + String.valueOf(valueOf14).length() + String.valueOf(valueOf15).length());
        sb.append("RetainedState{superState=");
        sb.append("null");
        sb.append(", tabsAndSectionListControllerStates=");
        sb.append(valueOf);
        sb.append(", lastSelectedTabIndex=");
        sb.append(i);
        sb.append(", responseTrackingParams=");
        sb.append(arrays);
        sb.append(", browseResponseModel=");
        sb.append(valueOf2);
        sb.append(", title=");
        sb.append(valueOf3);
        sb.append(", enableTranslucentActionBar=");
        sb.append(z);
        sb.append(", hideTitleOnTranslucentHeader=");
        sb.append(z2);
        sb.append(", responseExpiryElapsedTimeMillis=");
        sb.append(j);
        sb.append(", backgroundColor=");
        sb.append(valueOf4);
        sb.append(", statusBarColor=");
        sb.append(valueOf5);
        sb.append(", primaryTextColor=");
        sb.append(valueOf6);
        sb.append(", secondaryTextColor=");
        sb.append(valueOf7);
        sb.append(", iconTintColor=");
        sb.append(valueOf8);
        sb.append(", restrictedModeEnabled=");
        sb.append(z3);
        sb.append(", backgroundResponseReceivedCommand=");
        sb.append(valueOf9);
        sb.append(", viewScrolledBeyondThresholdCommand=");
        sb.append(valueOf10);
        sb.append(", libraryLinksTransientState=");
        sb.append(valueOf11);
        sb.append(", feedFilterBarState=");
        sb.append(valueOf12);
        sb.append(", mySubsFeedFilterBarState=");
        sb.append(valueOf13);
        sb.append(", homeAdsPanelRenderers=");
        sb.append(valueOf14);
        sb.append(", engagementPanelRenderers=");
        sb.append(valueOf15);
        sb.append("}");
        return sb.toString();
    }

    protected ior() {
    }
}
