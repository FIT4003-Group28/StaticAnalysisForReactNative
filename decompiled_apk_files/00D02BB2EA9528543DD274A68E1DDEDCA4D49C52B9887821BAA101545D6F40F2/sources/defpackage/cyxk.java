package defpackage;
/* compiled from: PG */
/* renamed from: cyxk  reason: default package */
/* loaded from: classes5.dex */
public enum cyxk {
    UNSPECIFIED,
    PERSON,
    GROUP,
    GOOGLE_GROUP;

    public static boolean a(cyxk cyxkVar) {
        return cyxkVar == PERSON || cyxkVar == GOOGLE_GROUP;
    }
}
