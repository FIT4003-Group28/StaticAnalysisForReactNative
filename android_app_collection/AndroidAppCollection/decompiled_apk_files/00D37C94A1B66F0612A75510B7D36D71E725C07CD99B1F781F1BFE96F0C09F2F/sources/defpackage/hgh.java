package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.common.ui.ShortsEditToolButtonView;
import com.google.android.apps.youtube.app.extensions.reel.creation.shorts.music.ShortsCreationSelectedTrack;
import com.google.android.youtube.R;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: hgh  reason: default package */
/* loaded from: classes3.dex */
public final class hgh {
    public final hfn a;
    public final View b;
    public final acti c;
    public final hkl d;
    public final TextView e;
    public final ImageView f;
    public final ajnj g;
    public final actj h;
    final hgk i;
    private final hey j;
    private aypg k;

    public hgh(View view, acti actiVar, actj actjVar, boolean z, dt dtVar, Context context, hfn hfnVar, ajmy ajmyVar, hey heyVar, hkl hklVar) {
        this.a = hfnVar;
        this.b = view;
        this.c = actiVar;
        this.j = heyVar;
        this.h = actjVar;
        this.d = hklVar;
        view.setOnClickListener(new View.OnClickListener() { // from class: hgd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                hgh hghVar = hgh.this;
                actj actjVar2 = hghVar.h;
                if (actjVar2 != null) {
                    hghVar.c.H(3, new acte(actjVar2), null);
                }
                if (hghVar.a.a() == null) {
                    hghVar.b();
                } else {
                    hghVar.i.G();
                }
            }
        });
        hgk hgkVar = new hgk(context, dtVar.getSupportFragmentManager(), new hgf(this, hfnVar), hklVar);
        this.i = hgkVar;
        hgkVar.a.setVisibility(true != z ? 8 : 0);
        TextView textView = (TextView) view.findViewById(R.id.shorts_camera_music_button_title);
        this.e = textView;
        if (textView != null && hklVar.e()) {
            textView.setText(R.string.camera_add_sounds_button);
        }
        if (!(view instanceof ShortsEditToolButtonView)) {
            this.f = null;
            this.g = null;
            return;
        }
        ImageView imageView = ((ShortsEditToolButtonView) view).c;
        this.f = imageView;
        this.g = new ajnj(ajmyVar, imageView);
        c();
    }

    public final void a() {
        this.k = this.a.b().X(aypa.a()).as(new ayqb() { // from class: hge
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ajnj ajnjVar;
                hgh hghVar = hgh.this;
                ampq ampqVar = (ampq) obj;
                if (ampqVar.h() && !amps.e(((ShortsCreationSelectedTrack) ampqVar.c()).j())) {
                    if (!((ShortsCreationSelectedTrack) ampqVar.c()).l()) {
                        ShortsCreationSelectedTrack shortsCreationSelectedTrack = (ShortsCreationSelectedTrack) ampqVar.c();
                        TextView textView = hghVar.e;
                        if (textView != null) {
                            textView.setText(shortsCreationSelectedTrack.j());
                        }
                        if (hghVar.f != null && (ajnjVar = hghVar.g) != null) {
                            ajnjVar.l(shortsCreationSelectedTrack.h(), new hgg(hghVar));
                            hghVar.f.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            hghVar.f.setBackground(hghVar.b.getContext().getDrawable(R.drawable.shorts_edit_thumbnail_rounded_corner));
                            hghVar.f.setClipToOutline(true);
                        }
                    }
                } else {
                    TextView textView2 = hghVar.e;
                    if (textView2 != null) {
                        textView2.setText(true != hghVar.d.e() ? R.string.camera_add_music_button : R.string.camera_add_sounds_button);
                    }
                    hghVar.c();
                }
                TextView textView3 = hghVar.e;
                if (textView3 != null) {
                    textView3.setSelected(true);
                }
            }
        });
    }

    public final void b() {
        this.j.a(this.c, this.h);
    }

    public final void c() {
        ajnj ajnjVar;
        if (this.f == null || (ajnjVar = this.g) == null) {
            return;
        }
        ajnjVar.g(R.drawable.ic_shorts_editor_music);
        this.f.setScaleType(ImageView.ScaleType.CENTER);
        this.f.setBackground(null);
        this.f.setClipToOutline(false);
    }

    public final void d() {
        ayqi.c((AtomicReference) this.k);
    }

    public final void e(boolean z) {
        this.b.setEnabled(z);
        TextView textView = this.e;
        if (textView != null) {
            textView.setEnabled(z);
        }
        ImageView imageView = (ImageView) this.b.findViewById(R.id.shorts_camera_music_button_icon);
        if (imageView != null) {
            zxq.a(this.b.getContext(), imageView, z);
        }
    }
}
