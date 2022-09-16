package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: nec  reason: default package */
/* loaded from: classes3.dex */
public final class nec extends ajsl {
    private final fmg a;
    private final ajmy b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final ImageView g;

    public nec(Context context, ajmy ajmyVar, fmh fmhVar) {
        this.b = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.topic_channel_details, (ViewGroup) null);
        this.c = inflate;
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.g = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.e = (TextView) inflate.findViewById(R.id.subscriber_count);
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.f = textView;
        this.a = fmhVar.a(textView, null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ajsl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void d(defpackage.ajrs r4, java.lang.Object r5) {
        /*
            r3 = this;
            avji r5 = (defpackage.avji) r5
            avhn r0 = r5.c
            if (r0 != 0) goto L8
            avhn r0 = defpackage.avhn.a
        L8:
            ajmy r1 = r3.b
            android.widget.ImageView r2 = r3.g
            r1.h(r2, r0)
            if (r0 == 0) goto L37
            int r1 = r0.b
            r1 = r1 & 4
            if (r1 == 0) goto L37
            aovs r1 = r0.d
            if (r1 != 0) goto L1d
            aovs r1 = defpackage.aovs.a
        L1d:
            int r1 = r1.b
            r1 = r1 & 1
            if (r1 == 0) goto L37
            android.widget.ImageView r1 = r3.g
            aovs r0 = r0.d
            if (r0 != 0) goto L2b
            aovs r0 = defpackage.aovs.a
        L2b:
            aovr r0 = r0.c
            if (r0 != 0) goto L31
            aovr r0 = defpackage.aovr.a
        L31:
            java.lang.String r0 = r0.c
            r1.setContentDescription(r0)
            goto L3d
        L37:
            android.widget.ImageView r0 = r3.g
            r1 = 0
            r0.setContentDescription(r1)
        L3d:
            android.widget.TextView r0 = r3.d
            arag r1 = r5.b
            if (r1 != 0) goto L45
            arag r1 = defpackage.arag.a
        L45:
            android.text.Spanned r1 = defpackage.ajgl.b(r1)
            defpackage.zag.m(r0, r1)
            android.widget.TextView r0 = r3.e
            arag r1 = r5.d
            if (r1 != 0) goto L54
            arag r1 = defpackage.arag.a
        L54:
            android.text.Spanned r1 = defpackage.ajgl.b(r1)
            defpackage.zag.m(r0, r1)
            aunb r5 = r5.e
            if (r5 != 0) goto L61
            aunb r5 = defpackage.aunb.a
        L61:
            aopg r0 = com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass.subscribeButtonRenderer
            java.lang.Object r5 = defpackage.ajjh.l(r5, r0)
            avaq r5 = (defpackage.avaq) r5
            if (r5 == 0) goto L72
            fmg r0 = r3.a
            acti r4 = r4.a
            r0.i(r5, r4)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nec.d(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((avji) obj).f.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.g.setBackground(null);
        this.d.setText((CharSequence) null);
        this.e.setText((CharSequence) null);
        this.a.d();
    }
}
