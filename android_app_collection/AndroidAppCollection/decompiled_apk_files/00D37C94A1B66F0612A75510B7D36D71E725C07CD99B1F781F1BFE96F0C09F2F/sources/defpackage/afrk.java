package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: afrk  reason: default package */
/* loaded from: classes.dex */
public final class afrk extends yo {
    final ImageView t;
    final TextView u;
    final LinearLayout v;
    final /* synthetic */ afrl w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afrk(afrl afrlVar, View view) {
        super(view);
        this.w = afrlVar;
        this.t = (ImageView) this.a.findViewById(R.id.video_thumbnail_button);
        this.u = (TextView) this.a.findViewById(R.id.change_label);
        this.v = (LinearLayout) this.a.findViewById(R.id.change_label_container);
    }
}
