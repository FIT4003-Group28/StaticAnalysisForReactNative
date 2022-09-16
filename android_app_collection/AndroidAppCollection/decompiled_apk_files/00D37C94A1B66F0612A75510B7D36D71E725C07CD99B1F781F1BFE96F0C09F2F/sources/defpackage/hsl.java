package defpackage;

import android.graphics.Bitmap;
import android.util.Patterns;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeButton;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hsl  reason: default package */
/* loaded from: classes3.dex */
public final class hsl extends zxr {
    public String a;
    public Bitmap b;
    public EditText c;
    private final dt d;
    private View e;
    private View f;
    private View g;
    private WebView h;
    private YouTubeButton i;
    private final hvh j;

    public hsl(dt dtVar, hvh hvhVar) {
        super(dtVar, dtVar.getSupportFragmentManager(), null, true, false);
        this.d = dtVar;
        this.j = hvhVar;
    }

    @Override // defpackage.zxr
    protected final View a() {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.d, (int) R.style.ReelsBottomSheetDialog)).inflate(R.layout.link_sticker_fragment, (ViewGroup) null);
        this.c = (EditText) inflate.findViewById(R.id.link_input);
        this.f = inflate.findViewById(R.id.clear_input);
        this.g = inflate.findViewById(R.id.scroll_view);
        this.h = (WebView) inflate.findViewById(R.id.link_preview);
        this.e = inflate.findViewById(R.id.link_input_frame);
        this.c.addTextChangedListener(new hsk(this));
        this.c.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: hsh
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                hsl hslVar = hsl.this;
                if (i == 6) {
                    zag.i(hslVar.c);
                    hslVar.j();
                    return true;
                }
                return false;
            }
        });
        this.f.setOnClickListener(new hsg(this, 1));
        YouTubeButton youTubeButton = (YouTubeButton) inflate.findViewById(R.id.link_sticker_add_button);
        this.i = youTubeButton;
        youTubeButton.setOnClickListener(new hsg(this));
        m();
        this.h.setWebViewClient(new hsi(this));
        this.h.setWebChromeClient(new hsj(this));
        this.h.setScrollBarStyle(33554432);
        this.h.setScrollbarFadingEnabled(false);
        WebSettings settings = this.h.getSettings();
        if (settings != null) {
            settings.setJavaScriptEnabled(true);
            settings.setSupportZoom(true);
            settings.setLoadWithOverviewMode(true);
            settings.setUseWideViewPort(true);
        }
        return inflate;
    }

    @Override // defpackage.zxr
    protected final CharSequence b() {
        return this.d.getResources().getString(R.string.stories_add_link_header);
    }

    public final void j() {
        String obj = this.c.getText().toString();
        if (this.g.getVisibility() == 8) {
            if (!Patterns.WEB_URL.matcher(obj).matches()) {
                return;
            }
            this.e.setVisibility(8);
            this.g.setVisibility(0);
            this.h.loadUrl(obj);
            this.i.setText(R.string.stories_add_link_sticker);
            return;
        }
        hvh hvhVar = this.j;
        String str = this.a;
        Bitmap bitmap = this.b;
        View inflate = LayoutInflater.from(hvhVar.a).inflate(R.layout.link_sticker_card, (ViewGroup) null);
        ((TextView) inflate.findViewById(R.id.page_title)).setText(str);
        ((TextView) inflate.findViewById(R.id.link_url)).setText(obj);
        if (bitmap != null) {
            ImageView imageView = (ImageView) inflate.findViewById(R.id.icon);
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
        }
        aopa createBuilder = axbk.a.createBuilder();
        axay axayVar = axay.a;
        createBuilder.copyOnWrite();
        axbk axbkVar = (axbk) createBuilder.instance;
        axayVar.getClass();
        axbkVar.d = axayVar;
        axbkVar.c = 13;
        axbl j = axbm.j();
        j.copyOnWrite();
        ((axbm) j.instance).F((axbk) createBuilder.mo39build());
        hxb.e(hvhVar.a, hvhVar.f, inflate, j, new huy(hvhVar.b, 2));
        hvhVar.d.z();
        this.c.setText("");
    }

    @Override // defpackage.zxr, defpackage.zxy
    public final boolean lZ() {
        if (this.g.getVisibility() == 0) {
            if (!this.h.canGoBack()) {
                this.g.setVisibility(8);
                this.e.setVisibility(0);
                this.i.setText(R.string.stories_link_sticker_preview);
                return true;
            }
            this.h.goBack();
            return true;
        }
        return false;
    }

    public final void m() {
        if (this.c.getEditableText().length() != 0) {
            this.f.setVisibility(0);
        } else {
            this.f.setVisibility(8);
        }
    }
}
