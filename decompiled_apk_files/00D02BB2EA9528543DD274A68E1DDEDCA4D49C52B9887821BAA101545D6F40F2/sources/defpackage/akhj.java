package defpackage;

import android.widget.TextView;
/* compiled from: PG */
/* renamed from: akhj  reason: default package */
/* loaded from: classes2.dex */
final class akhj extends cqmr<akky> {
    final /* synthetic */ TextView a;

    public akhj(TextView textView) {
        this.a = textView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqmr
    public final /* bridge */ /* synthetic */ void a(akky akkyVar, boolean z) {
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new akhl(akkyVar, this.a));
    }
}
