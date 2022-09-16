package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmah  reason: default package */
/* loaded from: classes5.dex */
public final class cmah {
    public final int a;
    public final String b;
    public final List<cmag> c;
    public final byte[] d;

    public cmah(int i, String str, List<cmag> list, byte[] bArr) {
        List<cmag> unmodifiableList;
        this.a = i;
        this.b = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.c = unmodifiableList;
        this.d = bArr;
    }
}
