package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.youtube.app.common.widget.TintableImageView;
import com.google.android.libraries.youtube.common.ui.CircularImageView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mhg  reason: default package */
/* loaded from: classes3.dex */
public final class mhg {
    public final ajmy a;
    public final ajxz b;
    public final Context c;
    public final ViewStub d;
    public final ViewStub e;
    public final ViewStub f;
    public final ViewStub g;
    public final ColorStateList h;
    public CircularImageView i;
    public FrameLayout j;
    public ImageView k;
    public ImageView l;
    public TintableImageView m;

    public mhg(ajmy ajmyVar, ajxz ajxzVar, View view) {
        this.a = ajmyVar;
        this.b = ajxzVar;
        Context context = view.getContext();
        this.c = context;
        this.d = (ViewStub) view.findViewById(R.id.circular_avatar_view_stub);
        this.e = (ViewStub) view.findViewById(R.id.cropped_square_avatar_view_stub);
        this.f = (ViewStub) view.findViewById(R.id.square_avatar_view_stub);
        this.g = (ViewStub) view.findViewById(R.id.icon_avatar_view_stub);
        this.h = zhn.f(context, R.attr.ytTextPrimary);
        this.i = (CircularImageView) view.findViewById(R.id.circular_avatar);
        this.j = (FrameLayout) view.findViewById(R.id.cropped_square_avatar);
        this.l = (ImageView) view.findViewById(R.id.square_avatar);
        this.m = (TintableImageView) view.findViewById(R.id.icon_avatar);
    }

    public static arhs a(aqdx aqdxVar) {
        if (aqdxVar == null || (aqdxVar.b & 128) == 0) {
            return null;
        }
        arhu arhuVar = aqdxVar.f;
        if (arhuVar == null) {
            arhuVar = arhu.a;
        }
        arhs arhsVar = arhuVar.c;
        return arhsVar == null ? arhs.a : arhsVar;
    }

    public static avhn b(aqdx aqdxVar) {
        if (aqdxVar == null || (aqdxVar.b & 1) == 0) {
            return null;
        }
        apup apupVar = aqdxVar.c;
        if (apupVar == null) {
            apupVar = apup.a;
        }
        avhn avhnVar = apupVar.b;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public static avhn c(aqdx aqdxVar) {
        if (aqdxVar == null || (aqdxVar.b & 2) == 0) {
            return null;
        }
        auem auemVar = aqdxVar.d;
        if (auemVar == null) {
            auemVar = auem.a;
        }
        avhn avhnVar = auemVar.c;
        return avhnVar == null ? avhn.a : avhnVar;
    }

    public static avhn d(aqdx aqdxVar) {
        if (aqdxVar == null || (aqdxVar.b & 4) == 0) {
            return null;
        }
        auen auenVar = aqdxVar.e;
        if (auenVar == null) {
            auenVar = auen.a;
        }
        avhn avhnVar = auenVar.b;
        return avhnVar == null ? avhn.a : avhnVar;
    }
}
