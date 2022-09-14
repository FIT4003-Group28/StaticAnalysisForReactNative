package defpackage;

import java.io.IOException;
/* compiled from: PG */
/* renamed from: dash  reason: default package */
/* loaded from: classes5.dex */
public class dash extends IOException {
    private static final long serialVersionUID = -1875819453475890043L;
    public final int b;

    /* JADX INFO: Access modifiers changed from: protected */
    public dash(dasg dasgVar) {
        super(dasgVar.c);
        this.b = dasgVar.a;
    }

    public static StringBuilder a(dasf dasfVar) {
        StringBuilder sb = new StringBuilder();
        int i = dasfVar.c;
        if (i != 0) {
            sb.append(i);
        }
        String str = dasfVar.d;
        if (str != null) {
            if (i != 0) {
                sb.append(' ');
            }
            sb.append(str);
        }
        return sb;
    }
}
