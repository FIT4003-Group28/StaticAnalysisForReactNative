package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aocc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aocc implements osm {
    private final /* synthetic */ int c;
    public static final /* synthetic */ aocc b = new aocc(1);
    public static final /* synthetic */ aocc a = new aocc();

    private /* synthetic */ aocc() {
    }

    private /* synthetic */ aocc(int i) {
        this.c = i;
    }

    @Override // defpackage.osm
    public final Object a(Object obj) {
        anza anzaVar;
        anyr anyrVar;
        if (this.c == 0) {
            aodi aodiVar = (aodi) obj;
            anzd anzdVar = dni.a;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                anzaVar = new anza(byteArrayOutputStream, anzdVar.a, anzdVar.b, anzdVar.c);
                anyrVar = (anyr) anzaVar.c.get(aodiVar.getClass());
            } catch (IOException unused) {
            }
            if (anyrVar != null) {
                anyrVar.a(aodiVar, anzaVar);
                return byteArrayOutputStream.toByteArray();
            }
            String valueOf = String.valueOf(aodiVar.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("No encoder for ");
            sb.append(valueOf);
            throw new anyo(sb.toString());
        }
        return ((angc) obj).toByteArray();
    }
}
