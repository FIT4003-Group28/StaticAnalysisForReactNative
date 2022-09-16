package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: emi  reason: default package */
/* loaded from: classes3.dex */
public final class emi implements ajru {
    private final foa a;
    private final ImageView b;

    public emi(Context context, fob fobVar, ViewGroup viewGroup) {
        ImageView imageView = (ImageView) LayoutInflater.from(context).inflate(R.layout.subscription_notification_options_button, viewGroup, false);
        this.b = imageView;
        this.a = fobVar.a(imageView);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        this.a.b((avbl) obj, ajrsVar.a);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.b(null, null);
    }
}
