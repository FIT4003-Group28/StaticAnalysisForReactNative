package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Observable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: afjz  reason: default package */
/* loaded from: classes.dex */
public final class afjz extends Observable implements afka {
    public final aadd a;
    public final axxl b;
    protected final yrj c;
    public final aacz d;
    public final Context e;
    public final Resources f;
    public final yve g;
    public final ampq h;
    public final afmq i;
    public final afme j;
    public String k;
    public volatile amvn l;
    public final boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final afss q;
    private final AtomicBoolean r = new AtomicBoolean();
    private final axxm s;
    private final axxj t;
    private final ankt u;
    private String v;
    private final Set w;
    private boolean x;
    private String y;
    private String z;

    public afjz(Context context, yve yveVar, ampq ampqVar, yrj yrjVar, aadd aaddVar, aacz aaczVar, afmq afmqVar, afme afmeVar, afsz afszVar, axxl axxlVar, axxm axxmVar, axxj axxjVar) {
        this.a = aaddVar;
        this.d = aaczVar;
        this.b = axxlVar;
        this.s = axxmVar;
        this.t = axxjVar;
        this.c = yrjVar;
        aaddVar.a.as(new ayqb() { // from class: afjx
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                afjz afjzVar = afjz.this;
                arhd arhdVar = (arhd) obj;
                afjzVar.l = amvn.p(afjzVar.n().M);
            }
        });
        this.w = Collections.newSetFromMap(new ConcurrentHashMap());
        this.z = null;
        this.e = context;
        this.f = context.getResources();
        this.g = yveVar;
        this.h = ampqVar;
        this.i = afmqVar;
        this.j = afmeVar;
        ankt i = anii.i(yveVar.a(), new anir() { // from class: aflz
            @Override // defpackage.anir
            public final ankt a(Object obj) {
                apfj apfjVar;
                afjz afjzVar = afjz.this;
                awuj awujVar = (awuj) obj;
                String valueOf = String.valueOf(Build.ID);
                String valueOf2 = String.valueOf(Build.VERSION.INCREMENTAL);
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                if (concat.equals(awujVar.p)) {
                    apyy b = afjzVar.d.b();
                    if (b != null) {
                        atdx atdxVar = b.q;
                        if (atdxVar == null) {
                            atdxVar = atdx.a;
                        }
                        apfjVar = atdxVar.b;
                        if (apfjVar == null) {
                            apfjVar = apfj.a;
                        }
                    } else {
                        apfjVar = apfj.a;
                    }
                    if (!apfjVar.b) {
                        return ankq.a;
                    }
                }
                return afjzVar.g.b(new wdx(concat, 16));
            }
        }, anjk.a);
        this.u = i;
        this.q = afszVar.b;
        this.l = amyg.a;
        this.m = zfm.f(context);
        ylx.m(i, adkd.s);
    }

    public static boolean aR(int i, Display display) {
        Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
        if (hdrCapabilities != null) {
            for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public static aujv s(aadd aaddVar) {
        if (aaddVar == null || aaddVar.a() == null) {
            return aujv.b;
        }
        atdy atdyVar = aaddVar.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        aujv aujvVar = atdyVar.f;
        return aujvVar == null ? aujv.b : aujvVar;
    }

    public final boolean A() {
        return n().j > 0;
    }

    public final boolean B() {
        return o().aI;
    }

    public final boolean C() {
        int e = aqxo.e(n().d);
        return e != 0 && e == 4;
    }

    public final boolean D() {
        return o().M;
    }

    public final boolean E() {
        return n().F;
    }

    public final boolean F() {
        return n().B;
    }

    public final boolean G() {
        if (I()) {
            return !o().R || !this.c.r();
        }
        return false;
    }

    public final boolean H() {
        return o().al;
    }

    public final boolean I() {
        if (H() || K()) {
            return t().isEmpty() || t().contains(Integer.valueOf(this.c.a()));
        }
        return false;
    }

    public final boolean J() {
        if (!I()) {
            return false;
        }
        return o().K;
    }

    public final boolean K() {
        return o().am;
    }

    public final boolean L() {
        return o().N;
    }

    public final boolean M() {
        Boolean bool;
        aqxe aqxeVar = this.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45352577L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352577L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352577L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean N() {
        return o().ay;
    }

    public final boolean O() {
        return n().i;
    }

    public final boolean P() {
        Boolean bool;
        aqxe aqxeVar = this.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45352576L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352576L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352576L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean Q() {
        return V(this.b.a.a.V(axxk.c).B());
    }

    public final boolean R() {
        return o().ab;
    }

    public final boolean S() {
        return V(this.s.a.a.V(axxk.h).B());
    }

    public final boolean T() {
        return o().aC;
    }

    public final boolean U() {
        aunw aunwVar;
        arhd a = this.a.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aunwVar = atdyVar.n;
            if (aunwVar == null) {
                aunwVar = aunw.a;
            }
        } else {
            aunwVar = aunw.a;
        }
        return aunwVar.b;
    }

    public final synchronized boolean V(ayoi ayoiVar) {
        AtomicBoolean atomicBoolean = this.r;
        atomicBoolean.getClass();
        ayqi.c((AtomicReference) ayoiVar.as(new ldk(atomicBoolean, 7)));
        return this.r.get();
    }

    public final boolean W() {
        return V(this.b.a.a.V(axxd.o).B());
    }

    public final boolean X() {
        return a() > 0 || aj();
    }

    public final boolean Y() {
        return an() != 2;
    }

    public final boolean Z(aqwv aqwvVar) {
        return new aops(o().s, aqww.a).contains(aqwvVar);
    }

    public final int a() {
        return o().z;
    }

    public final synchronized void aA(String str) {
        this.y = str;
    }

    @Override // defpackage.afka
    public final void aB(boolean z) {
        if (this.n != z) {
            this.n = z;
            setChanged();
            notifyObservers(2);
        }
    }

    public final synchronized void aC(String str) {
        this.z = str;
    }

    public final void aD(FormatStreamModel formatStreamModel) {
        afky h;
        if (ao() != 3 || (h = agpr.h(formatStreamModel)) == afky.NO_FALLBACK) {
            return;
        }
        this.w.add(h);
    }

    public final synchronized boolean aE() {
        return this.x;
    }

    public final boolean aF() {
        return o().ai && !this.p;
    }

    public final boolean aG(Set set) {
        return aH(set, amyg.a);
    }

    public final boolean aH(Set set, Set set2) {
        return aI("av1_supported", "video/av01", false, set, set2, 0);
    }

    public final boolean aI(String str, String str2, boolean z, Set set, Set set2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(Build.VERSION.RELEASE);
        boolean z2 = false;
        Set[] setArr = {set, set2};
        HashSet hashSet = new HashSet();
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            for (String str3 : setArr[i3]) {
                int hashCode = str3.hashCode();
                Integer valueOf = Integer.valueOf(hashCode);
                if (!hashSet.contains(valueOf)) {
                    i2 ^= hashCode;
                    hashSet.add(valueOf);
                }
            }
        }
        if (i2 != 0) {
            sb.append("_");
            sb.append(i2);
        }
        String sb2 = sb.toString();
        awuj awujVar = (awuj) this.g.c();
        sb2.getClass();
        if (!awujVar.l.containsKey(sb2)) {
            try {
                if (afmg.c(str2, z, set, set2, i) != null) {
                    z2 = true;
                }
                ylx.m(this.g.b(new fco(sb2, z2, 2)), adkd.r);
            } catch (otu unused) {
            }
            return z2;
        }
        sb2.getClass();
        aoqp aoqpVar = awujVar.l;
        if (!aoqpVar.containsKey(sb2)) {
            return false;
        }
        return ((Boolean) aoqpVar.get(sb2)).booleanValue();
    }

    public final boolean aJ() {
        return this.h.h() && ((awuk) ((yve) this.h.c()).c()).b;
    }

    public final boolean aK(Set set) {
        return aI("h264_main_profile_supported", "video/avc", false, set, amyg.a, 0);
    }

    public final boolean aL(Set set) {
        return aI("opus_supported", "audio/opus", false, set, amyg.a, 0);
    }

    public final boolean aM(Set set, Set set2) {
        return aO(au()) && aI("vp9_secure_supported", "video/x-vnd.on2.vp9", true, set, set2, 0);
    }

    public final boolean aN(Set set, Set set2) {
        return aI("vp9_profile_2_supported", "video/x-vnd.on2.vp9", false, set, set2, 4096);
    }

    public final boolean aO(String str) {
        return !this.l.contains(str);
    }

    public final boolean aP(Set set, Set set2) {
        return aO(au()) && aI("vp9_supported", "video/x-vnd.on2.vp9", false, set, set2, 0);
    }

    public final boolean aQ() {
        return !this.o;
    }

    public final boolean aS(int i) {
        int i2;
        WindowManager windowManager = (WindowManager) this.e.getSystemService("window");
        if (windowManager == null || Build.VERSION.SDK_INT < 24) {
            return false;
        }
        int i3 = i - 1;
        if (i3 == 16) {
            i2 = 2;
        } else if (i3 != 18) {
            return false;
        } else {
            i2 = 3;
        }
        return aR(i2, windowManager.getDefaultDisplay());
    }

    public final boolean aa() {
        return n().x;
    }

    public final boolean ab() {
        return V(this.b.a.a.V(axxk.g).B());
    }

    public final boolean ac() {
        Boolean bool;
        aqxe aqxeVar = this.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45352655L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352655L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352655L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean ad() {
        Boolean bool;
        aqxe aqxeVar = this.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        boolean z = false;
        if (aqxeVar.a(45353051L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45353051L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45353051L);
            if (aqxfVar.b == 1) {
                z = ((Boolean) aqxfVar.c).booleanValue();
            }
            bool = Boolean.valueOf(z);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean ae() {
        return o().C;
    }

    public final boolean af() {
        return o().aF;
    }

    public final boolean ag() {
        return p().d;
    }

    public final boolean ah() {
        return p().x;
    }

    public final boolean ai() {
        return o().V;
    }

    public final boolean aj() {
        return o().O;
    }

    public final boolean ak() {
        return o().S;
    }

    public final boolean al() {
        return n().f;
    }

    public final boolean am() {
        return n().r;
    }

    public final int an() {
        Long l;
        aqxe aqxeVar = this.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        long j = 0;
        if (aqxeVar.a(45352575L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352575L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352575L);
            if (aqxfVar.b == 2) {
                j = ((Long) aqxfVar.c).longValue();
            }
            l = Long.valueOf(j);
        } else {
            l = 0L;
        }
        int intValue = Long.valueOf(l.longValue()).intValue();
        int i = 5;
        if (intValue == 0) {
            i = 2;
        } else if (intValue == 1) {
            i = 3;
        } else if (intValue == 2) {
            i = 4;
        } else if (intValue != 3) {
            i = intValue != 4 ? intValue != 5 ? 0 : 7 : 6;
        }
        if (i == 0) {
            return 2;
        }
        return i;
    }

    public final int ao() {
        int c = aqxo.c(o().F);
        if (c == 0) {
            return 2;
        }
        return c;
    }

    public final int ap() {
        if (zew.b == 0) {
            zew.b = zgd.z();
        }
        return Math.max(zew.b + o().m, 1);
    }

    public final int aq() {
        if (!this.i.f()) {
            awan b = awan.b(((awuj) this.g.c()).m);
            if (b == null) {
                b = awan.VIDEO_QUALITY_SETTING_UNKNOWN;
            }
            return b.equals(awan.VIDEO_QUALITY_SETTING_DATA_SAVER) ? 480 : Integer.MAX_VALUE;
        }
        return Integer.MAX_VALUE;
    }

    public final aanu ar() {
        adrz adrzVar = adrz.k;
        Enum r1 = aanu.DEFAULT;
        if (this.h.h()) {
            try {
                r1 = Enum.valueOf(aanu.class, (String) adrzVar.apply((awuk) ((yve) this.h.c()).c()));
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
        }
        return (aanu) r1;
    }

    public final synchronized String as() {
        return this.y;
    }

    public final synchronized String at() {
        return this.z;
    }

    public final String au() {
        if (this.v == null) {
            az();
        }
        return this.v;
    }

    public final Set av() {
        if (ao() == 3) {
            return amvn.p(this.w);
        }
        return EnumSet.noneOf(afky.class);
    }

    public final synchronized void aw() {
        this.x = true;
    }

    public final void az() {
        String str = Build.HARDWARE;
        String a = zgj.a("ro.board.platform");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(a).length());
        sb.append(str);
        sb.append(";");
        sb.append(a);
        this.k = sb.toString();
        this.v = zgj.a("ro.board.platform");
    }

    public final int b() {
        atdz atdzVar;
        arhd a = this.a.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            atdzVar = atdyVar.k;
            if (atdzVar == null) {
                atdzVar = atdz.a;
            }
        } else {
            atdzVar = atdz.a;
        }
        int i = atdzVar.d;
        if (i == 0) {
            return 360;
        }
        return i;
    }

    public final int c() {
        return o().n;
    }

    public final int d() {
        return o().o;
    }

    public final int e() {
        return o().ax * 1000;
    }

    public final int f() {
        return o().h;
    }

    public final int g() {
        return o().aj;
    }

    public final int h() {
        Long l;
        aqxe aqxeVar = this.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        long j = 0;
        if (aqxeVar.a(45352578L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352578L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352578L);
            if (aqxfVar.b == 2) {
                j = ((Long) aqxfVar.c).longValue();
            }
            l = Long.valueOf(j);
        } else {
            l = 0L;
        }
        return (int) l.longValue();
    }

    public final long i() {
        Long l;
        aqxe aqxeVar = this.b.b.b().C;
        if (aqxeVar == null) {
            aqxeVar = aqxe.a;
        }
        long j = 0;
        if (aqxeVar.a(45352579L)) {
            aoqp aoqpVar = aqxeVar.b;
            if (!aoqpVar.containsKey(45352579L)) {
                throw new IllegalArgumentException();
            }
            aqxf aqxfVar = (aqxf) aoqpVar.get(45352579L);
            if (aqxfVar.b == 2) {
                j = ((Long) aqxfVar.c).longValue();
            }
            l = Long.valueOf(j);
        } else {
            l = 0L;
        }
        return l.longValue();
    }

    public final long j() {
        long j = o().D;
        if (j > 0) {
            return j;
        }
        return 1000L;
    }

    public final long k() {
        long j = o().E;
        if (j > 0) {
            return j;
        }
        return 1000L;
    }

    public final long l() {
        return o().L;
    }

    public final ampq m() {
        final AtomicReference atomicReference = new AtomicReference();
        ayqi.c((AtomicReference) this.t.a.a.V(axxd.m).B().as(new ayqb() { // from class: afjy
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                atomicReference.set((String) obj);
            }
        }));
        String str = (String) atomicReference.get();
        return TextUtils.isEmpty(str) ? amon.a : ampq.j(str);
    }

    public final apfk n() {
        arhd a = this.a.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            apfk apfkVar = atdyVar.i;
            return apfkVar == null ? apfk.a : apfkVar;
        }
        return apfk.a;
    }

    public final aqww o() {
        arhd a = this.a.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aqww aqwwVar = atdyVar.h;
            return aqwwVar == null ? aqww.b : aqwwVar;
        }
        return aqww.b;
    }

    public final attt p() {
        arhd a = this.a.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            if (attvVar == null) {
                attvVar = attv.a;
            }
            attt atttVar = attvVar.g;
            return atttVar == null ? attt.b : atttVar;
        }
        return attt.b;
    }

    public final attv q() {
        arhd a = this.a.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            attv attvVar = atdyVar.d;
            return attvVar == null ? attv.a : attvVar;
        }
        return attv.a;
    }

    public final aujo r() {
        arhd a = this.a.a();
        if (a != null) {
            atdy atdyVar = a.i;
            if (atdyVar == null) {
                atdyVar = atdy.a;
            }
            aujo aujoVar = atdyVar.m;
            return aujoVar == null ? aujo.a : aujoVar;
        }
        return aujo.a;
    }

    public final List t() {
        return o().ak;
    }

    public final boolean u() {
        return o().aH;
    }

    public final boolean v() {
        return o().aE;
    }

    public final boolean w() {
        return o().A;
    }

    public final boolean x() {
        return o().G;
    }

    public final boolean y() {
        return o().H;
    }

    public final boolean z() {
        return A() || n().j == -1;
    }
}
