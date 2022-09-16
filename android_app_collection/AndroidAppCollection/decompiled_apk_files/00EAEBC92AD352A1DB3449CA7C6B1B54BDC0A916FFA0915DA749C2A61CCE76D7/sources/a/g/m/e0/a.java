package a.g.m.e0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: b  reason: collision with root package name */
    private final int f342b;

    /* renamed from: c  reason: collision with root package name */
    private final c f343c;

    /* renamed from: d  reason: collision with root package name */
    private final int f344d;

    public a(int i, c cVar, int i2) {
        this.f342b = i;
        this.f343c = cVar;
        this.f344d = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f342b);
        this.f343c.a(this.f344d, bundle);
    }
}
