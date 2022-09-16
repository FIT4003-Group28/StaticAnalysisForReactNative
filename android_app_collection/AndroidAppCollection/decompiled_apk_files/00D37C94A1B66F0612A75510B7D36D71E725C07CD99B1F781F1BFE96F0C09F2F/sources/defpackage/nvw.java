package defpackage;

import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nvw  reason: default package */
/* loaded from: classes3.dex */
public final class nvw {
    public final nvu a;
    public final adoa b;
    public int d;
    public boolean e;
    public final nvg g;
    private boolean h;
    private boolean i;
    private int j = 1;
    public final xhr f = new nvv(this);
    public final Set c = new HashSet();

    public nvw(ImageView imageView, ProgressBar progressBar, nvg nvgVar, adoa adoaVar) {
        this.a = new nvu(imageView, progressBar, this);
        this.g = nvgVar;
        this.b = adoaVar;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ahig ahigVar) {
        Set set = this.c;
        ahigVar.getClass();
        set.add(ahigVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(boolean z) {
        this.h = z;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        this.i = z;
        d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d() {
        if (this.e) {
            this.a.a(this.j);
        } else if (this.i) {
            nvu nvuVar = this.a;
            nvuVar.a.setOnClickListener(new nvt(nvuVar));
            nvuVar.a.setEnabled(true);
            nvuVar.b.setVisibility(8);
            if (nvuVar.e == null) {
                nvuVar.e = akf.a(nvuVar.a.getContext(), 2131232764);
            }
            nvuVar.b(nvuVar.e, R.string.playback_control_stop);
        } else if (this.h) {
            nvu nvuVar2 = this.a;
            nvuVar2.a.setOnClickListener(new nvt(nvuVar2, 1));
            nvuVar2.a.setEnabled(true);
            nvuVar2.b.setVisibility(0);
            ProgressBar progressBar = nvuVar2.b;
            if (nvuVar2.f == null) {
                nvuVar2.f = akf.a(nvuVar2.a.getContext(), R.drawable.floatybar_progress_circle_autonav);
            }
            progressBar.setProgressDrawable(nvuVar2.f);
            if (nvuVar2.d == null) {
                nvuVar2.d = akf.a(nvuVar2.a.getContext(), R.drawable.floatybar_progress_selector);
            }
            nvuVar2.b(nvuVar2.d, R.string.autonav_a11y);
        } else {
            this.a.a(this.j);
        }
    }

    public final void e(int i) {
        this.j = i;
        d();
    }
}
