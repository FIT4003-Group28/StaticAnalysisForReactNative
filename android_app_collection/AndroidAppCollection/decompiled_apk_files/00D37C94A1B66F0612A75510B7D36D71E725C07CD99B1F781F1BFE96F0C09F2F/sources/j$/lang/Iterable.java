package j$.lang;

import j$.util.Collection;
import j$.util.DesugarLinkedHashSet;
import j$.util.List$CC;
import j$.util.Set$CC;
import j$.util.SortedSet$CC;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.function.Consumer;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes5.dex */
public interface Iterable {

    /* compiled from: D8$$SyntheticClass */
    /* renamed from: j$.lang.Iterable$-EL  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class EL {
        public static /* synthetic */ void forEach(java.lang.Iterable iterable, Consumer consumer) {
            if (iterable instanceof Iterable) {
                ((Iterable) iterable).forEach(consumer);
            } else if (iterable instanceof Collection) {
                Collection.CC.$default$forEach((java.util.Collection) iterable, consumer);
            } else {
                CC.$default$forEach(iterable, consumer);
            }
        }

        public static /* synthetic */ Spliterator spliterator(java.lang.Iterable iterable) {
            return iterable instanceof Iterable ? ((Iterable) iterable).mo536spliterator() : iterable instanceof LinkedHashSet ? DesugarLinkedHashSet.spliterator((LinkedHashSet) iterable) : iterable instanceof SortedSet ? SortedSet$CC.$default$spliterator((SortedSet) iterable) : iterable instanceof Set ? Set$CC.$default$spliterator((Set) iterable) : iterable instanceof List ? List$CC.$default$spliterator((List) iterable) : iterable instanceof java.util.Collection ? Spliterators.spliterator((java.util.Collection) iterable, 0) : CC.$default$spliterator(iterable);
        }
    }

    void forEach(Consumer consumer);

    /* renamed from: spliterator */
    Spliterator mo536spliterator();

    /* renamed from: j$.lang.Iterable$-CC  reason: invalid class name */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static void $default$forEach(java.lang.Iterable iterable, Consumer consumer) {
            consumer.getClass();
            for (Object obj : iterable) {
                consumer.accept(obj);
            }
        }

        public static Spliterator $default$spliterator(java.lang.Iterable iterable) {
            return Spliterators.spliteratorUnknownSize(iterable.iterator(), 0);
        }
    }
}
