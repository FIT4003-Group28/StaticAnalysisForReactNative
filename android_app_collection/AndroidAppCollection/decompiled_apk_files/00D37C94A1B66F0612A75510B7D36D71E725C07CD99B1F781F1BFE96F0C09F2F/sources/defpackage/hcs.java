package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hcs  reason: default package */
/* loaded from: classes3.dex */
public final class hcs implements View.OnClickListener {
    public final gzf a;
    public final ImageView b;
    public final String c;
    public final String d;
    private final hci e;
    private final View f;
    private final hkl g;

    public hcs(hci hciVar, gzf gzfVar, ypf ypfVar, hkl hklVar, View view) {
        this.e = hciVar;
        this.a = gzfVar;
        this.g = hklVar;
        this.c = view.getResources().getString(R.string.reel_accessibility_play_video);
        this.d = view.getResources().getString(R.string.reel_accessibility_pause_video);
        ImageView imageView = (ImageView) view.findViewById(R.id.play_pause_button);
        this.b = imageView;
        lj.M(imageView, new hcr(this));
        imageView.setOnClickListener(this);
        View findViewById = view.findViewById(R.id.done_button);
        this.f = findViewById;
        findViewById.setOnClickListener(this);
        hklVar.o();
        a();
        gzfVar.c().q(zna.t(ypfVar.a())).as(new ayqb() { // from class: hcq
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                hcs.this.a();
            }
        });
    }

    public final void a() {
        this.b.setSelected(this.a.i());
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.f) {
            this.e.f(actj.SHORTS_CREATION_EDITOR_TIMELINE_EDITOR_DONE_BUTTON);
            this.g.o();
            this.e.d();
            this.a.g(0L);
            this.a.f();
        } else if (view != this.b) {
        } else {
            this.g.o();
            if (this.a.i()) {
                this.a.e();
            } else {
                this.a.f();
            }
        }
    }
}
