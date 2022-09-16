package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ygx  reason: default package */
/* loaded from: classes4.dex */
public final class ygx implements ajru {
    public final View a;
    private final ajmy b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final ImageView g;

    public ygx(Context context, ajmy ajmyVar, int i, ViewGroup viewGroup) {
        this.b = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.a = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.super_title_view);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.e = (YouTubeTextView) inflate.findViewById(R.id.sub_title_view);
        this.f = (ImageView) inflate.findViewById(R.id.background_image);
        this.g = (ImageView) inflate.findViewById(R.id.channel_image);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public final void d(auyh auyhVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        avhn avhnVar;
        YouTubeTextView youTubeTextView = this.c;
        avhn avhnVar2 = null;
        if ((auyhVar.b & 512) != 0) {
            aragVar = auyhVar.h;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, ajgl.b(aragVar));
        YouTubeTextView youTubeTextView2 = this.d;
        if ((auyhVar.b & 128) != 0) {
            aragVar2 = auyhVar.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(youTubeTextView2, ajgl.b(aragVar2));
        YouTubeTextView youTubeTextView3 = this.e;
        if ((auyhVar.b & 256) != 0) {
            aragVar3 = auyhVar.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(youTubeTextView3, ajgl.b(aragVar3));
        ajmy ajmyVar = this.b;
        ImageView imageView = this.f;
        if ((auyhVar.b & 2) != 0) {
            avhnVar = auyhVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        this.f.setColorFilter(auyhVar.c & (-1711276033), PorterDuff.Mode.LIGHTEN);
        ajmy ajmyVar2 = this.b;
        ImageView imageView2 = this.g;
        if ((auyhVar.b & 8) != 0 && (avhnVar2 = auyhVar.e) == null) {
            avhnVar2 = avhn.a;
        }
        ajmyVar2.h(imageView2, avhnVar2);
        this.a.setBackgroundColor(auyhVar.c);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((auyh) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
