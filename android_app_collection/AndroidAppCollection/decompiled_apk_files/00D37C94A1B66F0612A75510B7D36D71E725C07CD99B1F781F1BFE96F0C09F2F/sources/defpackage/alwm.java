package defpackage;

import android.view.Window;
import com.google.android.setupcompat.internal.TemplateLayout;
/* compiled from: PG */
/* renamed from: alwm  reason: default package */
/* loaded from: classes.dex */
public final class alwm implements alwk {
    public final TemplateLayout a;
    public final Window b;
    public final boolean c;
    public final boolean d;
    public int e = 0;

    public alwm(TemplateLayout templateLayout, Window window) {
        this.a = templateLayout;
        this.b = window;
        alvm alvmVar = (alvm) templateLayout;
        this.c = alvmVar.f();
        this.d = alvmVar.g();
    }
}
