package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.AutoValue_ReelEditModel;
import com.google.android.apps.youtube.app.extensions.reel.edit.fragment.ReelEditModel;
import java.util.List;
/* compiled from: PG */
/* renamed from: hnx  reason: default package */
/* loaded from: classes3.dex */
public final class hnx {
    public ReelEditModel.DeletedItem a;
    private amuk b;
    private Integer c;

    public hnx() {
    }

    public hnx(ReelEditModel reelEditModel) {
        AutoValue_ReelEditModel autoValue_ReelEditModel = (AutoValue_ReelEditModel) reelEditModel;
        this.b = autoValue_ReelEditModel.a;
        this.c = Integer.valueOf(autoValue_ReelEditModel.b);
        this.a = autoValue_ReelEditModel.c;
    }

    public final void b(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void c(List list) {
        this.b = amuk.o(list);
    }

    public final ReelEditModel a() {
        Integer num;
        amuk amukVar = this.b;
        if (amukVar == null || (num = this.c) == null) {
            StringBuilder sb = new StringBuilder();
            if (this.b == null) {
                sb.append(" reelItems");
            }
            if (this.c == null) {
                sb.append(" currentIndex");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        AutoValue_ReelEditModel autoValue_ReelEditModel = new AutoValue_ReelEditModel(amukVar, num.intValue(), this.a);
        aqxo.G(autoValue_ReelEditModel.b, autoValue_ReelEditModel.a.size());
        return autoValue_ReelEditModel;
    }
}
