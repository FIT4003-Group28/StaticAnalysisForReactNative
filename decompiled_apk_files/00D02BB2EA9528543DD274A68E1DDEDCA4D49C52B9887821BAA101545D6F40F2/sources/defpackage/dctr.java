package defpackage;

import java.util.Comparator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dctr  reason: default package */
/* loaded from: classes.dex */
final class dctr implements Comparator<Object> {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj).getKey()).compareTo((String) ((Map.Entry) obj2).getKey());
    }
}