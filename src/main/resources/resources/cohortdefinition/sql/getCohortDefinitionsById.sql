-- Eventually, this will be driven from cohort_definition, but this is to get it going
SELECT
 COHORT_DEFINITION_ID, 
 COHORT_DEFINITION_NAME, 
 COHORT_DEFINITION_DESCRIPTION, 
 DEFINITION_TYPE_CONCEPT_ID, 
 COHORT_DEFINITION_SYNTAX, 
 SUBJECT_CONCEPT_ID,
 COHORT_INITIATION_DATE 
FROM 
  @results_schema.COHORT_DEFINITION
WHERE 
  COHORT_DEFINITION_ID = @id