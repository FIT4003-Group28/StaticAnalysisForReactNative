package j$.util.stream;

import j$.util.Map;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer;
import j$.util.function.BinaryOperator;
import j$.util.function.Function;
import j$.util.function.Supplier;
import j$.util.stream.Collector;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes5.dex */
public final class Collectors {
    static final Set CH_ID;
    static final Set CH_NOID;
    static final Set CH_UNORDERED_ID;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object lambda$castingIdentity$2(Object obj) {
        return obj;
    }

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        CH_ID = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        CH_UNORDERED_ID = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        CH_NOID = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    private static IllegalStateException duplicateKeyException(Object obj, Object obj2, Object obj3) {
        return new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", obj, obj2, obj3));
    }

    private static BinaryOperator uniqKeysMapMerger() {
        return Collectors$$ExternalSyntheticLambda40.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Map lambda$uniqKeysMapMerger$0(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            value.getClass();
            Object putIfAbsent = Map.EL.putIfAbsent(map, key, value);
            if (putIfAbsent != null) {
                throw duplicateKeyException(key, putIfAbsent, value);
            }
        }
        return map;
    }

    private static BiConsumer uniqKeysMapAccumulator(final Function function, final Function function2) {
        return new BiConsumer() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda5
            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Collectors.lambda$uniqKeysMapAccumulator$1(Function.this, function2, (java.util.Map) obj, obj2);
            }

            @Override // j$.util.function.BiConsumer
            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return biConsumer.getClass();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void lambda$uniqKeysMapAccumulator$1(Function function, Function function2, java.util.Map map, Object obj) {
        Object apply = function.apply(obj);
        Object apply2 = function2.apply(obj);
        apply2.getClass();
        Object putIfAbsent = Map.EL.putIfAbsent(map, apply, apply2);
        if (putIfAbsent == null) {
            return;
        }
        throw duplicateKeyException(apply, putIfAbsent, apply2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Function castingIdentity() {
        return Collectors$$ExternalSyntheticLambda58.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class CollectorImpl implements Collector {
        private final BiConsumer accumulator;
        private final Set characteristics;
        private final BinaryOperator combiner;
        private final Function finisher;
        private final Supplier supplier;

        /* JADX INFO: Access modifiers changed from: package-private */
        public CollectorImpl(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
            this.supplier = supplier;
            this.accumulator = biConsumer;
            this.combiner = binaryOperator;
            this.finisher = function;
            this.characteristics = set;
        }

        CollectorImpl(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Set set) {
            this(supplier, biConsumer, binaryOperator, Collectors.castingIdentity(), set);
        }

        @Override // j$.util.stream.Collector
        public BiConsumer accumulator() {
            return this.accumulator;
        }

        @Override // j$.util.stream.Collector
        public Supplier supplier() {
            return this.supplier;
        }

        @Override // j$.util.stream.Collector
        public BinaryOperator combiner() {
            return this.combiner;
        }

        @Override // j$.util.stream.Collector
        public Function finisher() {
            return this.finisher;
        }

        @Override // j$.util.stream.Collector
        public Set characteristics() {
            return this.characteristics;
        }
    }

    public static Collector toList() {
        return new CollectorImpl(Collectors$$ExternalSyntheticLambda85.INSTANCE, Collectors$$ExternalSyntheticLambda23.INSTANCE, Collectors$$ExternalSyntheticLambda37.INSTANCE, CH_ID);
    }

    public static Collector toSet() {
        return new CollectorImpl(Collectors$$ExternalSyntheticLambda89.INSTANCE, Collectors$$ExternalSyntheticLambda24.INSTANCE, Collectors$$ExternalSyntheticLambda41.INSTANCE, CH_UNORDERED_ID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Set lambda$toSet$7(Set set, Set set2) {
        if (set.size() < set2.size()) {
            set2.addAll(set);
            return set2;
        }
        set.addAll(set2);
        return set;
    }

    public static Collector joining(CharSequence charSequence) {
        return joining(charSequence, "", "");
    }

    public static Collector joining(final CharSequence charSequence, final CharSequence charSequence2, final CharSequence charSequence3) {
        return new CollectorImpl(new Supplier() { // from class: j$.util.stream.Collectors$$ExternalSyntheticLambda74
            @Override // j$.util.function.Supplier
            /* renamed from: get */
            public final Object mo515get() {
                return Collectors.lambda$joining$11(charSequence, charSequence2, charSequence3);
            }
        }, Collectors$$ExternalSyntheticLambda25.INSTANCE, Collectors$$ExternalSyntheticLambda43.INSTANCE, Collectors$$ExternalSyntheticLambda64.INSTANCE, CH_NOID);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ StringJoiner lambda$joining$11(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        return new StringJoiner(charSequence, charSequence2, charSequence3);
    }

    public static Collector toMap(Function function, Function function2) {
        return new CollectorImpl(Collectors$$ExternalSyntheticLambda88.INSTANCE, uniqKeysMapAccumulator(function, function2), uniqKeysMapMerger(), CH_ID);
    }
}
