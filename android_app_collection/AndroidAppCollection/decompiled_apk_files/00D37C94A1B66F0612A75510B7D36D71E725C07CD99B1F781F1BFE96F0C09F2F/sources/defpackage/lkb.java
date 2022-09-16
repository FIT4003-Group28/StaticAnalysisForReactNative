package defpackage;

import android.widget.CompoundButton;
/* compiled from: PG */
/* renamed from: lkb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lkb implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ lkd a;
    private final /* synthetic */ int b;

    public /* synthetic */ lkb(lkd lkdVar) {
        this.a = lkdVar;
    }

    public /* synthetic */ lkb(lkd lkdVar, int i) {
        this.b = i;
        this.a = lkdVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.b == 0) {
            zag.o(this.a.a, z);
        } else {
            zag.o(this.a.g, z);
        }
    }
}
