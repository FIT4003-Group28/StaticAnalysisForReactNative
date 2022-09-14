package defpackage;

import android.widget.SeekBar;
import com.google.android.apps.gmm.navigation.developer.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: arpg  reason: default package */
/* loaded from: classes2.dex */
public class arpg implements aroy {
    public static final dcdn<Integer, Float> c;
    private static final int d;
    public final arni a;
    public int b;
    private final dzsj<gga> e;
    @dzsi
    private final atmz f;
    private final SeekBar.OnSeekBarChangeListener g = new arpf(this);

    static {
        dcdg p = dcdn.p();
        p.f(0, Float.valueOf(0.0f));
        p.f(1, Float.valueOf(0.5f));
        p.f(2, Float.valueOf(1.0f));
        p.f(3, Float.valueOf(2.0f));
        p.f(4, Float.valueOf(5.0f));
        p.f(5, Float.valueOf(10.0f));
        p.f(6, Float.valueOf(10000.0f));
        dcdn<Integer, Float> b = p.b();
        c = b;
        d = b.size() - 1;
    }

    public arpg(arni arniVar, @dzsi atmz atmzVar, cqhn cqhnVar, dzsj<gga> dzsjVar) {
        dcet dcetVar;
        this.a = arniVar;
        this.f = atmzVar;
        this.e = dzsjVar;
        dcdn<Integer, Float> dcdnVar = c;
        if (dcdnVar.isEmpty()) {
            dcetVar = dcay.a;
        } else {
            dcet dcetVar2 = dcdnVar.b;
            dcet dcetVar3 = dcetVar2;
            if (dcetVar2 == null) {
                dcet dcetVar4 = new dcet(new dcdl(dcdnVar), dcdnVar.size());
                dcdnVar.b = dcetVar4;
                dcetVar3 = dcetVar4;
            }
            dcetVar = dcetVar3;
        }
        dced dcedVar = dcetVar.d;
        dced dcedVar2 = dcedVar;
        if (dcedVar == null) {
            dceq a = dcet.a();
            dcpd it = dcetVar.s().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                a.b(entry.getValue(), entry.getKey());
            }
            dcet<V, K> a2 = a.a();
            a2.d = dcetVar;
            dcetVar.d = a2;
            dcedVar2 = a2;
        }
        this.b = ((Integer) dcedVar2.h(Float.valueOf(arniVar.c())).v().get(0)).intValue();
    }

    @Override // defpackage.aroy
    public cqkl a() {
        this.a.a();
        atmz atmzVar = this.f;
        if (atmzVar != null) {
            atmzVar.c();
        }
        return cqkl.a;
    }

    @Override // defpackage.aroy
    public cqkl b() {
        this.a.b();
        atmz atmzVar = this.f;
        if (atmzVar != null) {
            atmzVar.c();
        }
        return cqkl.a;
    }

    @Override // defpackage.aroy
    public cqkl c() {
        this.a.d();
        atmz atmzVar = this.f;
        if (atmzVar != null) {
            atmzVar.c();
        }
        return cqkl.a;
    }

    @Override // defpackage.aroy
    public SeekBar.OnSeekBarChangeListener d() {
        return this.g;
    }

    @Override // defpackage.aroy
    public CharSequence e() {
        return this.e.a().getString(R.string.AUTODRIVE_SPEED);
    }

    @Override // defpackage.aroy
    public String f() {
        int i = this.b;
        if (i == 0) {
            return this.e.a().getString(R.string.TOGGLE_AUTODRIVE_OFF);
        }
        String valueOf = String.valueOf(c.get(Integer.valueOf(i)));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1);
        sb.append("x");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // defpackage.aroy
    public int g() {
        return d;
    }

    @Override // defpackage.aroy
    public int h() {
        return this.b;
    }
}
