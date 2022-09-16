package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.edit.audioswap.ui.AudioSelectionActivity;
/* compiled from: PG */
/* renamed from: zjp  reason: default package */
/* loaded from: classes4.dex */
public final class zjp implements View.OnClickListener {
    final /* synthetic */ AudioSelectionActivity a;

    public zjp(AudioSelectionActivity audioSelectionActivity) {
        this.a = audioSelectionActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.j();
        this.a.c();
    }
}
