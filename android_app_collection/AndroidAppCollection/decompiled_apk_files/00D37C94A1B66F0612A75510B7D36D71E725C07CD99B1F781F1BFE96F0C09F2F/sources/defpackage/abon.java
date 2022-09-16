package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abon  reason: default package */
/* loaded from: classes.dex */
public final class abon implements TextWatcher {
    final /* synthetic */ abop a;
    private final int b;
    private boolean c;
    private ForegroundColorSpan d;

    public abon(abop abopVar) {
        this.a = abopVar;
        this.b = zhn.j(abopVar.a, R.attr.ytTextDisabled).orElse(0);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onTextChanged(java.lang.CharSequence r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abon.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
