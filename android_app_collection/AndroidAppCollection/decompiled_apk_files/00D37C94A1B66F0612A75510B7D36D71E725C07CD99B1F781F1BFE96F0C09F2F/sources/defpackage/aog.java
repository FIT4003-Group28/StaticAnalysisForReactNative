package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
/* compiled from: PG */
/* renamed from: aog  reason: default package */
/* loaded from: classes.dex */
public final class aog extends InputConnectionWrapper {
    private final TextView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aog(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        int i = 0;
        this.a = textView;
        anp b = anp.b();
        if (!b.e() || editorInfo == null || editorInfo.extras == null) {
            return;
        }
        anj anjVar = b.e;
        Bundle bundle = editorInfo.extras;
        ani aniVar = (ani) anjVar;
        bmq bmqVar = aniVar.b.d;
        int a = bmqVar.a(4);
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", a != 0 ? bmqVar.b.getInt(a + bmqVar.a) : i);
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", aniVar.c.g);
    }

    private final Editable a() {
        return this.a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return ant.b(this, a(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return ant.b(this, a(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
