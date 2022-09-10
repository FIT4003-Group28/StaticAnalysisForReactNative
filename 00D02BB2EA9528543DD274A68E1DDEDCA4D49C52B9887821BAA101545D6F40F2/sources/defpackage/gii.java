package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.layout.MainLayout;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: gii  reason: default package */
/* loaded from: classes.dex */
public final class gii {
    public View a;
    public float b;
    public int c;
    public float d;
    private final MainLayout e;
    private final int f;

    public gii(MainLayout mainLayout, int i) {
        this.e = mainLayout;
        this.f = i;
    }

    @dzsi
    public final View a() {
        if (this.a == null) {
            this.a = this.e.findViewById(this.f);
        }
        return this.a;
    }
}
