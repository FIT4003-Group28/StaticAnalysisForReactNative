package defpackage;

import android.content.Context;
import android.widget.RemoteViews;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: vyf  reason: default package */
/* loaded from: classes7.dex */
final class vyf extends vyk {
    private final dbty<CharSequence> b;

    public vyf(Context context, dbty<CharSequence> dbtyVar) {
        super(context);
        this.b = dbtyVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vyk
    public final List<RemoteViews> a(vyi vyiVar) {
        return Collections.singletonList(vyj.a(this.a, vyiVar, (CharSequence) ((dbuc) this.b).a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ((CharSequence) ((dbuc) ((vyf) obj).b).a).equals(((dbuc) this.b).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{((dbuc) this.b).a});
    }

    public final String toString() {
        return ((CharSequence) ((dbuc) this.b).a).toString();
    }
}
