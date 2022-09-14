package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: albg  reason: default package */
/* loaded from: classes2.dex */
public class albg implements Serializable {
    public static final eatp b = eato.b("HH:mm:ss:SSS");
    public final List<albi> a = new ArrayList();

    @dzsi
    public final albi a(int i) {
        for (albi albiVar : this.a) {
            if (albiVar.b == i) {
                return albiVar;
            }
        }
        return null;
    }
}
