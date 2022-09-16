package defpackage;

import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abki  reason: default package */
/* loaded from: classes.dex */
public final class abki implements ajry {
    final /* synthetic */ akce a;
    private final /* synthetic */ int b;

    public abki(akce akceVar) {
        this.a = akceVar;
    }

    public abki(akce akceVar, int i) {
        this.b = i;
        this.a = akceVar;
    }

    @Override // defpackage.ajry
    public final /* bridge */ /* synthetic */ ajru b(ViewGroup viewGroup) {
        if (this.b == 0) {
            return this.a.a((ViewGroup) zag.g(viewGroup, R.id.emoji_picker_stub, R.id.emoji_picker));
        }
        return this.a.a((ViewGroup) zag.g(viewGroup, R.id.emoji_picker_stub, R.id.emoji_picker));
    }
}
