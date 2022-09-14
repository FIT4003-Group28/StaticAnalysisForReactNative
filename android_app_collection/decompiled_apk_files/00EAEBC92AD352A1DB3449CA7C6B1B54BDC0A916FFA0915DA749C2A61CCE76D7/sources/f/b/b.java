package f.b;

import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {
    public static <T> List<T> a(T t) {
        List<T> singletonList = Collections.singletonList(t);
        f.c.a.b.a(singletonList, "java.util.Collections.singletonList(element)");
        return singletonList;
    }
}
