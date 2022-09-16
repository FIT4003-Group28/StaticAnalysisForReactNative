package j$.util;

import j$.lang.Iterable;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
/* loaded from: classes5.dex */
public interface Collection extends Iterable {

    /* compiled from: D8$$SyntheticClass */
    /* renamed from: j$.util.Collection$-EL */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class EL {
        public static /* synthetic */ void forEach(java.util.Collection collection, Consumer consumer) {
            if (collection instanceof Collection) {
                ((Collection) collection).forEach(consumer);
            } else {
                CC.$default$forEach(collection, consumer);
            }
        }

        public static /* synthetic */ boolean removeIf(java.util.Collection collection, Predicate predicate) {
            return collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : CC.$default$removeIf(collection, predicate);
        }

        public static /* synthetic */ Spliterator spliterator(java.util.Collection collection) {
            Spliterator spliterator;
            if (collection instanceof Collection) {
                return ((Collection) collection).mo536spliterator();
            }
            if (collection instanceof LinkedHashSet) {
                return DesugarLinkedHashSet.spliterator((LinkedHashSet) collection);
            }
            if (collection instanceof SortedSet) {
                return SortedSet$CC.$default$spliterator((SortedSet) collection);
            }
            if (!(collection instanceof Set)) {
                return collection instanceof List ? List$CC.$default$spliterator((List) collection) : Spliterators.spliterator(collection, 0);
            }
            spliterator = Spliterators.spliterator((Set) collection, 1);
            return spliterator;
        }

        public static /* synthetic */ Stream stream(java.util.Collection collection) {
            return collection instanceof Collection ? ((Collection) collection).stream() : CC.$default$stream(collection);
        }
    }

    @Override // j$.lang.Iterable
    void forEach(Consumer consumer);

    boolean removeIf(Predicate predicate);

    @Override // j$.lang.Iterable
    /* renamed from: spliterator */
    Spliterator mo536spliterator();

    Stream stream();

    /* renamed from: j$.util.Collection$-CC */
    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class CC {
        public static boolean $default$removeIf(java.util.Collection collection, Predicate predicate) {
            if (DesugarCollections.SYNCHRONIZED_COLLECTION.isInstance(collection)) {
                return DesugarCollections.removeIf(collection, predicate);
            }
            predicate.getClass();
            boolean z = false;
            java.util.Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (predicate.test(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        public static void $default$forEach(java.util.Collection collection, Consumer consumer) {
            consumer.getClass();
            for (Object obj : collection) {
                consumer.accept(obj);
            }
        }

        public static Stream $default$stream(java.util.Collection collection) {
            return StreamSupport.stream(EL.spliterator(collection), false);
        }
    }
}
