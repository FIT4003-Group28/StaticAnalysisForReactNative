package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
/* compiled from: PG */
/* renamed from: vtq  reason: default package */
/* loaded from: classes4.dex */
public abstract class vtq extends RelativeLayout implements SeekBar.OnSeekBarChangeListener, vqs, ota {
    public final Runnable a;
    public long b;
    public otb c;
    boolean d;
    public final List e;
    private TextView f;
    private TextView g;
    private SeekBar h;
    private int i;
    private int j;
    private vqr k;
    private final Set l;
    private final List m;

    public vtq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new vtn(this, 1);
        this.i = -1;
        this.j = -1;
        this.l = new HashSet();
        this.d = false;
        this.m = new CopyOnWriteArrayList();
        this.e = new CopyOnWriteArrayList();
    }

    private final long v() {
        vqr vqrVar = this.k;
        if (vqrVar != null) {
            return vqrVar.m();
        }
        return 0L;
    }

    private final long w() {
        vqr vqrVar = this.k;
        if (vqrVar != null) {
            return vqrVar.n();
        }
        return 0L;
    }

    private final void x(long j) {
        otb otbVar = this.c;
        if (otbVar == null) {
            return;
        }
        double d = j;
        Double.isNaN(d);
        otbVar.j((long) Math.ceil(d / 1000.0d));
    }

    public void a(vqr vqrVar, Set set) {
        this.l.addAll(set);
        if (this.c != null) {
            this.d = u();
            this.c.l(false);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b(vqrVar, ((Integer) it.next()).intValue());
        }
    }

    @Override // defpackage.vqs
    public final void b(vqr vqrVar, int i) {
        if (this.c == null) {
            return;
        }
        if (i == 0) {
            x(vqrVar.n());
        } else if (i == 1 && !this.l.contains(0)) {
            x(vqrVar.l());
        }
        r();
    }

    public void c(vqr vqrVar, Set set) {
        this.l.removeAll(set);
        otb otbVar = this.c;
        if (otbVar == null) {
            return;
        }
        long c = otbVar.c() * 1000;
        if (set.contains(0)) {
            c = vqrVar.n();
        } else if (set.contains(1)) {
            c = Math.max(vqrVar.l() - (true != this.d ? 0L : 1000000L), vqrVar.n());
        }
        if (set.size() == 1 && set.contains(2)) {
            return;
        }
        x(c);
        this.c.l(this.d);
    }

    public final long d() {
        vqr vqrVar = this.k;
        if (vqrVar != null) {
            return vqrVar.k();
        }
        otb otbVar = this.c;
        if (otbVar == null) {
            return 0L;
        }
        return ((vtr) otbVar).a.d();
    }

    public final void e(vug vugVar) {
        this.m.add(vugVar);
    }

    public final void f(boolean z) {
        vqr vqrVar = this.k;
        if (vqrVar != null) {
            vqrVar.a.h = z;
        }
        r();
        s();
    }

    public final void g() {
        for (vug vugVar : this.m) {
            vugVar.aF(u());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(TextView textView, TextView textView2, SeekBar seekBar) {
        viu.d(this.h == null);
        textView.getClass();
        this.f = textView;
        textView2.getClass();
        this.g = textView2;
        seekBar.getClass();
        this.h = seekBar;
        seekBar.setOnSeekBarChangeListener(this);
    }

    public final void i() {
        x(w());
    }

    public final void j(vug vugVar) {
        this.m.remove(vugVar);
    }

    public final void n(otb otbVar) {
        otb otbVar2 = this.c;
        if (otbVar2 != null) {
            otbVar2.i(this);
        }
        this.c = otbVar;
        if (otbVar != null) {
            otbVar.e(this);
        }
        q();
        g();
    }

    public final void o(vqr vqrVar) {
        vqr vqrVar2 = this.k;
        if (vqrVar2 != null) {
            vqrVar2.u(this);
        }
        this.k = vqrVar;
        if (vqrVar != null) {
            vqrVar.q(this);
        }
        r();
        s();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z) {
            x(w() + (i * 1000));
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
        if (this.c != null) {
            this.d = u();
            this.c.l(false);
        }
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        otb otbVar = this.c;
        if (otbVar != null) {
            otbVar.l(this.d);
        }
    }

    public void p() {
        if (this.c == null) {
            return;
        }
        boolean u = u();
        if (!u && t()) {
            i();
        }
        this.c.l(!u);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void q();

    public final void r() {
        if (this.c == null) {
            return;
        }
        long d = d() - v();
        if (this.l.isEmpty()) {
            this.h.setMax((int) d);
        }
        int i = (int) (d / 1000);
        if (i == this.j) {
            return;
        }
        this.j = i;
        this.g.setText(vqw.f(getContext(), this.j * 1000, false));
        this.g.setContentDescription(vqw.g(getContext(), R.string.edited_video_duration_content_description, this.j * 1000));
    }

    @Override // defpackage.ota
    public final void rL() {
    }

    @Override // defpackage.ota
    public final void rM(osx osxVar) {
    }

    @Override // defpackage.ota
    public final void rN(boolean z, int i) {
        post(new vtn(this));
    }

    public final void s() {
        otb otbVar = this.c;
        if (otbVar == null) {
            return;
        }
        long c = otbVar.c() - v();
        if (this.l.isEmpty()) {
            this.h.setProgress((int) c);
        } else {
            c = 0;
        }
        int i = (int) (c / 1000);
        if (i != this.i) {
            this.i = i;
            this.f.setText(vqw.f(getContext(), this.i * 1000, false));
            this.f.setContentDescription(vqw.g(getContext(), R.string.current_playback_time_content_description, this.i * 1000));
        }
        for (vuf vufVar : this.e) {
            vufVar.aG(this.b);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean t() {
        otb otbVar = this.c;
        return otbVar != null && otbVar.c() >= d();
    }

    public final boolean u() {
        otb otbVar = this.c;
        return otbVar != null && otbVar.o();
    }
}
