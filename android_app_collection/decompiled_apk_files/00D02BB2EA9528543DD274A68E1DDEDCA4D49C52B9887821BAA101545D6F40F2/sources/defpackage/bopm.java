package defpackage;

import android.widget.NumberPicker;
import java.util.List;
/* compiled from: PG */
/* renamed from: bopm  reason: default package */
/* loaded from: classes3.dex */
public class bopm {
    private final dzsj<cqhn> a;

    public bopm(dzsj<cqhn> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bopl a(bokh bokhVar, List<String> list, int i, int i2, Boolean bool, boolean z, @dzsi NumberPicker.OnValueChangeListener onValueChangeListener) {
        cqhn a = this.a.a();
        b(a, 1);
        b(bokhVar, 2);
        b(list, 3);
        b(bool, 6);
        return new bopl(a, bokhVar, list, i, i2, bool, z, onValueChangeListener);
    }
}
