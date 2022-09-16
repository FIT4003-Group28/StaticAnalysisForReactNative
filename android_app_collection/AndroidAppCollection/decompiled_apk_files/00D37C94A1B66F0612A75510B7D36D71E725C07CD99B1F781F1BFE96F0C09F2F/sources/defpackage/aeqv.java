package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: aeqv  reason: default package */
/* loaded from: classes.dex */
public final class aeqv implements aerm, aerw {
    final aesn a;
    Boolean b;
    pec c;
    private final azqb d;
    private final afjm e;
    private final String f;
    private List g;
    private String h;
    private String i;
    private String j;

    public aeqv(Context context, afjm afjmVar, azqb azqbVar, aesh aeshVar) {
        afms.a(azqbVar);
        this.d = azqbVar;
        this.e = afjmVar;
        this.f = zew.A(context);
        this.a = new aesn(aeshVar, this);
    }

    static final pob e() {
        try {
            return pob.f(phk.d);
        } catch (Exception e) {
            throw new poe(1, e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int h() {
        char c;
        String b = this.c.b();
        if (b == null) {
            return -1;
        }
        switch (b.hashCode()) {
            case 2405:
                if (b.equals("L1")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 2406:
                if (b.equals("L2")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 2407:
                if (b.equals("L3")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return 1;
        }
        return c != 2 ? -1 : 3;
    }

    private static aqqx i(Throwable th) {
        if (!(th.getCause() instanceof pod) || !(th.getCause().getCause() instanceof aesf)) {
            return aqqx.a;
        }
        aesg aesgVar = ((aesf) th.getCause().getCause()).a;
        if (aesgVar != null) {
            aopa createBuilder = aqqx.a.createBuilder();
            String b = aesgVar.b();
            createBuilder.copyOnWrite();
            aqqx aqqxVar = (aqqx) createBuilder.instance;
            b.getClass();
            aqqxVar.b |= 4;
            aqqxVar.c = b;
            boolean d = aesgVar.d();
            createBuilder.copyOnWrite();
            aqqx aqqxVar2 = (aqqx) createBuilder.instance;
            aqqxVar2.b |= 8;
            aqqxVar2.d = d;
            return (aqqx) createBuilder.mo39build();
        }
        return aqqx.a;
    }

    private final aqqz j(byte[] bArr, Pair pair, boolean z, int i) {
        aopa createBuilder = aqqz.a.createBuilder();
        aoob x = aoob.x(bArr);
        createBuilder.copyOnWrite();
        aqqz aqqzVar = (aqqz) createBuilder.instance;
        aqqzVar.b |= 256;
        aqqzVar.k = x;
        long longValue = ((Long) pair.first).longValue();
        createBuilder.copyOnWrite();
        aqqz aqqzVar2 = (aqqz) createBuilder.instance;
        aqqzVar2.b |= 2;
        aqqzVar2.d = longValue;
        long longValue2 = ((Long) pair.second).longValue();
        createBuilder.copyOnWrite();
        aqqz aqqzVar3 = (aqqz) createBuilder.instance;
        aqqzVar3.b |= 4;
        aqqzVar3.e = longValue2;
        String str = this.i;
        createBuilder.copyOnWrite();
        aqqz aqqzVar4 = (aqqz) createBuilder.instance;
        str.getClass();
        aqqzVar4.b |= 16;
        aqqzVar4.g = str;
        String str2 = this.j;
        createBuilder.copyOnWrite();
        aqqz aqqzVar5 = (aqqz) createBuilder.instance;
        str2.getClass();
        aqqzVar5.b |= 32;
        aqqzVar5.h = str2;
        String str3 = this.h;
        createBuilder.copyOnWrite();
        aqqz aqqzVar6 = (aqqz) createBuilder.instance;
        str3.getClass();
        aqqzVar6.b |= 128;
        aqqzVar6.i = str3;
        createBuilder.copyOnWrite();
        aqqz aqqzVar7 = (aqqz) createBuilder.instance;
        aqqzVar7.b |= 8;
        aqqzVar7.f = z;
        createBuilder.copyOnWrite();
        aqqz aqqzVar8 = (aqqz) createBuilder.instance;
        aqqzVar8.b |= 512;
        aqqzVar8.l = i;
        List list = this.g;
        if (list != null) {
            createBuilder.copyOnWrite();
            aqqz aqqzVar9 = (aqqz) createBuilder.instance;
            aopq aopqVar = aqqzVar9.j;
            if (!aopqVar.c()) {
                aqqzVar9.j = aopi.mutableCopy(aopqVar);
            }
            aonk.addAll((Iterable) list, (List) aqqzVar9.j);
        }
        return (aqqz) createBuilder.mo39build();
    }

    private final void k() {
        this.h = null;
        this.g = null;
        this.b = null;
    }

    @Override // defpackage.aerm
    public final void b(String str, String str2, String str3, String str4) {
        this.h = str;
        this.i = str3;
        this.j = str4;
        this.g = null;
        this.b = null;
        try {
            pob e = e();
            this.a.e(null, str4, str3, str, str2);
            HashMap k = amxp.k(1);
            k.put("aid", this.f);
            this.c = new pec(aeqw.a, e, this.a, k);
        } catch (poe e2) {
            afkj.b(afki.DRM, "Widevine CDM engine isn't available. Unable to complete license fetch of videoId %s", str);
            throw new aerl(e2, i(e2));
        }
    }

    @Override // defpackage.aerm
    public final boolean d(String str) {
        boolean z;
        String str2 = this.h;
        if (str2 == null || !str2.equals(str) || this.g == null) {
            try {
                return "L1".equals(e().e());
            } catch (poe unused) {
                return false;
            }
        }
        if (this.b == null) {
            try {
                String e = e().e();
                boolean z2 = true;
                if (!this.g.contains(3) && !this.g.contains(4)) {
                    z = false;
                    if ("L1".equals(e) || !z) {
                        z2 = false;
                    }
                    this.b = Boolean.valueOf(z2);
                }
                z = true;
                if ("L1".equals(e)) {
                }
                z2 = false;
                this.b = Boolean.valueOf(z2);
            } catch (poe unused2) {
                this.b = false;
            }
        }
        return this.b.booleanValue();
    }

    @Override // defpackage.aerm
    public final aqqz f(List list, String str) {
        Format format;
        aze bbaVar;
        prt prtVar;
        this.a.f = 1;
        Iterator it = list.iterator();
        while (true) {
            format = null;
            if (!it.hasNext()) {
                break;
            }
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            if (formatStreamModel.Q()) {
                avg R = formatStreamModel.R(str);
                avf avfVar = R.d;
                asy asyVar = new asy(R.e, avfVar.a, avfVar.b, R.f);
                String str2 = R.a.k;
                if (str2 == null) {
                    prtVar = null;
                } else {
                    if (str2.startsWith("video/webm") || str2.startsWith("audio/webm") || str2.startsWith("application/webm")) {
                        bbaVar = new bba();
                    } else {
                        bbaVar = new bbw();
                    }
                    prtVar = new prt(bbaVar, 2, R.a);
                }
                psa psaVar = new psa(this.e.a(), asyVar, R.a, 0, null, prtVar);
                for (int i = 0; i < 3; i++) {
                    try {
                        psaVar.b();
                        Format[] formatArr = prtVar.b;
                        if (formatArr.length > 0) {
                            format = formatArr[0];
                        }
                        prtVar.f();
                    } catch (IOException unused) {
                    }
                }
                continue;
            }
        }
        if (format == null || format.o == null || this.h == null) {
            afkj.d(afki.DRM, "Requested DRM init data for Offline is null");
            throw new aeri();
        }
        try {
            try {
                byte[] e = this.c.e(format);
                Pair a = this.c.a(e);
                int h = h();
                this.g = this.a.c();
                return j(e, a, this.a.c, h);
            } catch (pnd e2) {
                throw new aerk(e2, i(e2));
            }
        } finally {
            this.c.c();
        }
    }

    @Override // defpackage.aerm
    public final void g(aqqz aqqzVar, long j) {
        byte[] I;
        int i = aqqzVar.b;
        if ((i & 256) != 0 || (i & 1) != 0) {
            aesn aesnVar = this.a;
            aesnVar.f = 3;
            aesnVar.e = Long.valueOf(j);
            try {
                try {
                    if ((aqqzVar.b & 256) != 0) {
                        I = aqqzVar.k.I();
                    } else {
                        I = aoob.z(aqqzVar.c).I();
                    }
                    this.c.d(I);
                    return;
                } catch (pnd e) {
                    throw new aerk(e, i(e));
                }
            } finally {
                this.c.c();
                k();
            }
        }
        afkj.d(afki.DRM, "Requested DRM key id for Offline is null");
        throw new aeri();
    }

    @Override // defpackage.aerw
    public final void rv() {
    }

    @Override // defpackage.aerm
    public final aqqz a(aqqz aqqzVar) {
        if ((aqqzVar.b & 256) == 0 || this.h == null) {
            afkj.d(afki.DRM, "Requested DRM key id for Offline is null");
            throw new aeri();
        } else if (!aqqzVar.f) {
            return null;
        } else {
            this.a.f = 2;
            try {
                try {
                    byte[] f = this.c.f(aqqzVar.k.I());
                    Pair a = this.c.a(f);
                    boolean z = this.a.c;
                    int h = h();
                    aerg a2 = ((aerh) this.d.get()).a(this.h);
                    if (a2 != null) {
                        this.g = a2.b;
                    } else {
                        this.g = this.a.c();
                    }
                    return j(f, a, z, h);
                } catch (pnd e) {
                    throw new aerk(e, i(e));
                }
            } finally {
                this.c.c();
            }
        }
    }
}
