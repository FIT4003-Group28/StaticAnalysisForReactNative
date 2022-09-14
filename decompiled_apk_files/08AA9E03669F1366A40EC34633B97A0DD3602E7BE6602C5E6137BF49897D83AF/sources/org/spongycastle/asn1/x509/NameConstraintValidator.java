package org.spongycastle.asn1.x509;
/* loaded from: classes.dex */
public interface NameConstraintValidator {
    void addExcludedSubtree(GeneralSubtree generalSubtree);

    void checkExcluded(GeneralName generalName);

    void checkPermitted(GeneralName generalName);

    void intersectEmptyPermittedSubtree(int i);

    void intersectPermittedSubtree(GeneralSubtree generalSubtree);

    void intersectPermittedSubtree(GeneralSubtree[] generalSubtreeArr);
}
