package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: zzk  reason: default package */
/* loaded from: classes4.dex */
public final class zzk implements aaan {
    private final ajmy a;
    private ImageSpan b;

    public zzk(ajmy ajmyVar) {
        ajmyVar.getClass();
        this.a = ajmyVar;
    }

    @Override // defpackage.aaan
    public final yo a(Context context, ViewGroup viewGroup, zyz zyzVar, boolean z) {
        return new zzj(LayoutInflater.from(context).inflate(true != z ? R.layout.info_card_simple_watch_next : R.layout.info_card_simple, viewGroup, false));
    }

    @Override // defpackage.aaan
    public final void b(Context context, zza zzaVar, yo yoVar, aaar aaarVar) {
        arag aragVar;
        apzg apzgVar;
        avhn avhnVar;
        arag aragVar2;
        zzj zzjVar = (zzj) yoVar;
        arjh d = zzaVar.d();
        arag aragVar3 = null;
        if ((d.b & 2) != 0) {
            aragVar = d.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((d.b & 64) != 0) {
            apzgVar = d.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        apzgVar.getClass();
        if ((d.b & 1) != 0) {
            avhnVar = d.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        avhnVar.getClass();
        if ((d.b & 4) != 0) {
            aragVar2 = d.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b2 = ajgl.b(aragVar2);
        if ((d.b & 32) != 0 && (aragVar3 = d.g) == null) {
            aragVar3 = arag.a;
        }
        CharSequence b3 = ajgl.b(aragVar3);
        if (b3 != null) {
            b3 = b3.toString().toUpperCase(context.getResources().getConfiguration().locale);
        }
        this.a.h(zzjVar.t, avhnVar);
        zag.m(zzjVar.u, b2);
        zag.m(zzjVar.v, b);
        if (b3 != null) {
            if (d.f) {
                TextView textView = zzjVar.w;
                if (this.b == null) {
                    this.b = new ImageSpan(context, BitmapFactory.decodeResource(context.getResources(), 2131231990), 1);
                }
                ImageSpan imageSpan = this.b;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b3);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 160);
                spannableStringBuilder.append((char) 8195);
                spannableStringBuilder.append((char) 8195);
                spannableStringBuilder.setSpan(imageSpan, spannableStringBuilder.length() - 2, spannableStringBuilder.length(), 17);
                textView.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            } else {
                zzjVar.w.setText(b3);
            }
            zzjVar.w.setContentDescription(b3);
            zzjVar.w.setVisibility(0);
        } else {
            zzjVar.w.setVisibility(8);
        }
        zzjVar.a.setOnClickListener(new zzi(aaarVar, apzgVar));
    }
}
