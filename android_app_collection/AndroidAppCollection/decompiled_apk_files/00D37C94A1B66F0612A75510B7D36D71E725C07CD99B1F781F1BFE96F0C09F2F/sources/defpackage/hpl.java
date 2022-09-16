package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: hpl  reason: default package */
/* loaded from: classes3.dex */
public final class hpl extends dp implements View.OnClickListener {
    public hpk a;
    private View ae;
    private boolean af = false;
    private CameraView b;
    private ImageView c;
    private View d;
    private View e;

    @Override // defpackage.dp
    public final void W() {
        if (this.af) {
            this.b.A();
        }
        super.W();
    }

    @Override // defpackage.dp
    public final void Y() {
        super.Y();
        if (this.af) {
            this.b.x();
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.cloneInContext(new ContextThemeWrapper(mJ(), 2132083359)).inflate(R.layout.reel_welcome_fragment, viewGroup, false);
        this.af = akdr.h(mJ(), 1);
        ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.reel_welcome_image);
        this.c = imageView;
        if (this.af) {
            CameraView cameraView = new CameraView(rb(), null);
            this.b = cameraView;
            cameraView.onFinishInflate();
            this.b.setId(R.id.reel_welcome_camera_view);
            CameraView cameraView2 = this.b;
            cameraView2.s = true;
            cameraView2.v(5);
            this.b.r(zna.c(mJ()));
            this.b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(this.b, 0);
        } else {
            imageView.setVisibility(0);
        }
        View findViewById = viewGroup2.findViewById(R.id.reel_welcome_learn_more);
        this.d = findViewById;
        findViewById.setOnClickListener(this);
        View findViewById2 = viewGroup2.findViewById(R.id.reel_welcome_close);
        this.e = findViewById2;
        findViewById2.setOnClickListener(this);
        View findViewById3 = viewGroup2.findViewById(R.id.reel_welcome_continue);
        this.ae = findViewById3;
        findViewById3.setOnClickListener(this);
        return viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hpk hpkVar = this.a;
        hpkVar.getClass();
        if (view == this.e) {
            hpkVar.aL();
        } else if (view == this.ae) {
            hml hmlVar = (hml) hpkVar;
            if (hmlVar.aZ()) {
                hmlVar.aV();
            } else {
                hmlVar.aS();
            }
        } else if (view != this.d) {
        } else {
            try {
                rb().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("%s?hl=%s", "https://support.google.com/youtube/answer/7568166", Locale.getDefault().getLanguage()))));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(mJ(), rh().getString(R.string.common_error_generic), 1).show();
            }
        }
    }
}
