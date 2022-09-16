package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ahpw  reason: default package */
/* loaded from: classes.dex */
public final class ahpw {
    public final ahpx a;
    public final ahoo b;
    public final ViewGroup c;
    public final Context d;
    public final ahof e;
    public final ahob f;
    public final Resources g;

    public ahpw(ViewGroup viewGroup, Context context, ahof ahofVar, ahob ahobVar) {
        viewGroup.getClass();
        this.c = viewGroup;
        ahofVar.getClass();
        this.e = ahofVar;
        this.d = context;
        Resources resources = context.getResources();
        resources.getClass();
        this.g = resources;
        ahobVar.getClass();
        this.f = ahobVar;
        this.b = ahobVar.a().clone();
        this.a = new ahpx(ahofVar, ahobVar);
    }
}
