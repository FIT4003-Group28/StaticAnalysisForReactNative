package defpackage;

import android.text.Spanned;
/* compiled from: PG */
/* renamed from: cfor  reason: default package */
/* loaded from: classes4.dex */
public class cfor implements cfnz {
    private final Spanned a;
    @dzsi
    private final Runnable b;

    public cfor(Spanned spanned, @dzsi Runnable runnable) {
        this.a = spanned;
        this.b = runnable;
    }

    @Override // defpackage.cfnz
    public Spanned a() {
        return this.a;
    }

    @Override // defpackage.cfnz
    public Boolean b() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.cfnz
    public cqkl c() {
        Runnable runnable = this.b;
        if (runnable != null) {
            runnable.run();
        }
        return cqkl.a;
    }
}
